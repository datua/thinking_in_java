package com.wzj.thinkinginjava.charpter12;

class DynamicFieldsException extends Exception {
	
}

public class DynamicFields {
	private Object[][] fields;
	
	public DynamicFields(int initialSize) {
		fields = new Object[initialSize][2];
		for (int i = 0; i < fields.length; i++) {
			fields[i] = new Object[]{null, null};
		}
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < fields.length; i++) {
			str.append(fields[i][0] + " : ");
			str.append(fields[i][1] + "\n");
		}
		
		return str.toString();
	}
	
	private int hasField(String id) {
		for (int i = 0; i < fields.length; i++) {
			if (id.equals(fields[i][0])) {
				return i;
			}
		}
		return -1;
	}
	
	private int getFieldNumber(String id) throws NoSuchFieldException {
		int num = hasField(id);
		if (num == -1) {
			throw new NoSuchFieldException();
		}
		return num;
	}
	
	private int makeField(String id) {
		for (int i = 0; i < fields.length; i++) {
			if (fields[i][0] == null) {
				fields[i][0] = id;
				return i;
			}
		}
		
		Object[][] tmp = new Object[fields.length + 1][2];
		for (int i = 0; i < fields.length; i++) {
			tmp[i] = fields[i];
		}
		for (int i = fields.length; i < tmp.length; i++) {
			tmp[i] = new Object[]{null, null};
		}
		fields = tmp;
		
		return makeField(id);
	}
	
	private Object getField(String id) throws NoSuchFieldException {
		return fields[getFieldNumber(id)][1];
	}
	
	private Object setField(String id, Object value) throws DynamicFieldsException {
		if (value == null) {
			DynamicFieldsException dynamicFieldsException = new DynamicFieldsException();
			dynamicFieldsException.initCause(new NullPointerException());
			throw dynamicFieldsException;
		}
		
		int fieldNum = hasField(id);
		if (fieldNum == -1) {
			fieldNum = makeField(id);
		}
		Object result = null;
		try {
			result = getField(id);
		} catch (NoSuchFieldException e) {
			throw new RuntimeException(e);
		}
		
		fields[fieldNum][1] = value;
		return result;
	}
	
	public static void main(String[] args) {
		DynamicFields dynamicFields = new DynamicFields(3);
		System.out.println(dynamicFields);
		
		try {
			dynamicFields.setField("d", "A value for d");
			dynamicFields.setField("number", 47);
			dynamicFields.setField("number2", 48);
			System.out.println(dynamicFields);
			dynamicFields.setField("d", "A new value for d");
			dynamicFields.setField("number3", 11);
			System.out.println(dynamicFields);
			System.out.println("dynamicFields.getField(\"d\" : )" + dynamicFields.getField("d"));
			Object fieldValue = dynamicFields.setField("d", null);
		} catch (NoSuchFieldException e) {
			e.printStackTrace(System.out);
		} catch (DynamicFieldsException e) {
			e.printStackTrace(System.out);
		}
	}
}
