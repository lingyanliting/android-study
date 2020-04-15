package com.xuandexinxi.android.study.pojo;

public class MyEvent {

	private int nameId;

	private Class<?> activity;

	public int getNameId() {
		return nameId;
	}

	public void setNameId(int nameId) {
		this.nameId = nameId;
	}

	public Class<?> getActivity() {
		return activity;
	}

	public void setActivity(Class<?> activity) {
		this.activity = activity;
	}

	public MyEvent(int nameId, Class<?> activity) {
		super();
		this.nameId = nameId;
		this.activity = activity;
	}

}
