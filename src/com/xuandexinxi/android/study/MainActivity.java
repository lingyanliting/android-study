package com.xuandexinxi.android.study;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ExpandableListView;

import com.xuandexinxi.android.study.adapter.MyExpandListViewAdapter;
import com.xuandexinxi.android.study.base.BaseActivity;
import com.xuandexinxi.android.study.pojo.MyEvent;
import com.xuandexinxi.android.study.view.activity.ActivityForResultActivity;
import com.xuandexinxi.android.study.view.activity.BundleActivity;
import com.xuandexinxi.android.study.view.activity.FragmentLifecycleActivity;
import com.xuandexinxi.android.study.view.activity.FragmentTestActivity;
import com.xuandexinxi.android.study.view.activity.LifecycleActivity;
import com.xuandexinxi.android.study.view.activity.OtherActivity;
import com.xuandexinxi.android.study.view.activity.OtherTestActivity;
import com.xuandexinxi.android.study.view.activity.SeniorFragmentTestActivity;
import com.xuandexinxi.android.study.view.activity.SingleInstanceActivity;
import com.xuandexinxi.android.study.view.activity.SingleTaskActivity;
import com.xuandexinxi.android.study.view.activity.SingleTopActivity;
import com.xuandexinxi.android.study.view.activity.StandardModelActivity;
import com.xuandexinxi.android.study.view.activity.StartActivity;
import com.xuandexinxi.android.study.view.basic.HelloWorldWorldActivity;
import com.xuandexinxi.android.study.view.documentation.DocumentationActivity;
import com.xuandexinxi.android.study.view.event.ActivityListenerActivity;
import com.xuandexinxi.android.study.view.event.AnonymousListenerActivity;
import com.xuandexinxi.android.study.view.event.AsyncTaskActivity;
import com.xuandexinxi.android.study.view.event.BindingTagActivity;
import com.xuandexinxi.android.study.view.event.CalPrimeActivity;
import com.xuandexinxi.android.study.view.event.CallbackHandlerActivity;
import com.xuandexinxi.android.study.view.event.ChangeCfgActivity;
import com.xuandexinxi.android.study.view.event.ConfigurationActivity;
import com.xuandexinxi.android.study.view.event.EventQsActivity;
import com.xuandexinxi.android.study.view.event.HandlerActivity;
import com.xuandexinxi.android.study.view.event.PlaneActivity;
import com.xuandexinxi.android.study.view.event.PropagationActivity;
import com.xuandexinxi.android.study.view.event.SendSmsActivity;
import com.xuandexinxi.android.study.view.intent.ActionAttrActivity;
import com.xuandexinxi.android.study.view.intent.ActionCateAttrActivity;
import com.xuandexinxi.android.study.view.intent.ActionDataActivity;
import com.xuandexinxi.android.study.view.intent.ComponentAttrActivity;
import com.xuandexinxi.android.study.view.intent.DataTypeAttrActivity;
import com.xuandexinxi.android.study.view.intent.DataTypeOverrideActivity;
import com.xuandexinxi.android.study.view.intent.IntentTabActivity;
import com.xuandexinxi.android.study.view.intent.ReturnHomeActivity;
import com.xuandexinxi.android.study.view.intent.SysActionActivity;
import com.xuandexinxi.android.study.view.res.AnimationDrawableActivity;
import com.xuandexinxi.android.study.view.res.AnimatorActivity;
import com.xuandexinxi.android.study.view.res.ArrayResActivity;
import com.xuandexinxi.android.study.view.res.AttrResActivity;
import com.xuandexinxi.android.study.view.res.ClipDrawableActivity;
import com.xuandexinxi.android.study.view.res.DpiSuitActivity;
import com.xuandexinxi.android.study.view.res.LayerDrawableActivity;
import com.xuandexinxi.android.study.view.res.RawResActivity;
import com.xuandexinxi.android.study.view.res.ScreenSizeActivity;
import com.xuandexinxi.android.study.view.res.ShapeDrawableActivity;
import com.xuandexinxi.android.study.view.res.StateListDrawableActivity;
import com.xuandexinxi.android.study.view.res.StyleResActivity;
import com.xuandexinxi.android.study.view.res.ValuesResActivity;
import com.xuandexinxi.android.study.view.res.XmlResActivity;
import com.xuandexinxi.android.study.view.ui.AbsoluteLayoutActivity;
import com.xuandexinxi.android.study.view.ui.ActionBarActivity;
import com.xuandexinxi.android.study.view.ui.ActionBarDropDownNavActivity;
import com.xuandexinxi.android.study.view.ui.ActionBarSwipeNavActivity;
import com.xuandexinxi.android.study.view.ui.ActionBarTabNavActivity;
import com.xuandexinxi.android.study.view.ui.ActionHomeActivity;
import com.xuandexinxi.android.study.view.ui.ActionItemActivity;
import com.xuandexinxi.android.study.view.ui.ActionViewActivity;
import com.xuandexinxi.android.study.view.ui.ActivityMenuActivity;
import com.xuandexinxi.android.study.view.ui.AdapterViewFlipperActivity;
import com.xuandexinxi.android.study.view.ui.AlertDialogActivity;
import com.xuandexinxi.android.study.view.ui.ArrayAdapterListViewActivity;
import com.xuandexinxi.android.study.view.ui.AutoCompleteTextViewActivity;
import com.xuandexinxi.android.study.view.ui.ButtonActivity;
import com.xuandexinxi.android.study.view.ui.CalendarViewActivity;
import com.xuandexinxi.android.study.view.ui.CheckButtonActivity;
import com.xuandexinxi.android.study.view.ui.ChooseDateActivity;
import com.xuandexinxi.android.study.view.ui.ChronometerActivity;
import com.xuandexinxi.android.study.view.ui.ClockActivity;
import com.xuandexinxi.android.study.view.ui.CodeViewActivity;
import com.xuandexinxi.android.study.view.ui.ContextMenuActivity;
import com.xuandexinxi.android.study.view.ui.CustomViewActivity;
import com.xuandexinxi.android.study.view.ui.DateDialogActivity;
import com.xuandexinxi.android.study.view.ui.DialogThemeActivity;
import com.xuandexinxi.android.study.view.ui.EditTextActivity;
import com.xuandexinxi.android.study.view.ui.ExpandableListViewActivity;
import com.xuandexinxi.android.study.view.ui.FrameLayoutActivity;
import com.xuandexinxi.android.study.view.ui.GridLayoutActivity;
import com.xuandexinxi.android.study.view.ui.GridViewActivity;
import com.xuandexinxi.android.study.view.ui.ImageButtonActivity;
import com.xuandexinxi.android.study.view.ui.ImageSwitcherActivity;
import com.xuandexinxi.android.study.view.ui.ImageViewActivity;
import com.xuandexinxi.android.study.view.ui.LinearLayoutActivity;
import com.xuandexinxi.android.study.view.ui.ListViewTithBaseAdapterActivity;
import com.xuandexinxi.android.study.view.ui.MenuActivity;
import com.xuandexinxi.android.study.view.ui.MenuResActivity;
import com.xuandexinxi.android.study.view.ui.MixViewActivity;
import com.xuandexinxi.android.study.view.ui.NotificationActivity;
import com.xuandexinxi.android.study.view.ui.NumberPickerActivity;
import com.xuandexinxi.android.study.view.ui.PopupMenuActivity;
import com.xuandexinxi.android.study.view.ui.PopupWindowActivity;
import com.xuandexinxi.android.study.view.ui.ProgressBarActivity;
import com.xuandexinxi.android.study.view.ui.ProgressDialogActivity;
import com.xuandexinxi.android.study.view.ui.QuickContactBadgeActivity;
import com.xuandexinxi.android.study.view.ui.RatingBarActivity;
import com.xuandexinxi.android.study.view.ui.RelativeLayoutActivity;
import com.xuandexinxi.android.study.view.ui.ScrollViewActivity;
import com.xuandexinxi.android.study.view.ui.SearchViewActivity;
import com.xuandexinxi.android.study.view.ui.SeekBarActivity;
import com.xuandexinxi.android.study.view.ui.SimpleAdapterListViewActivity;
import com.xuandexinxi.android.study.view.ui.SimpleListViewActivity;
import com.xuandexinxi.android.study.view.ui.SpinnerActivity;
import com.xuandexinxi.android.study.view.ui.StackViewActivity;
import com.xuandexinxi.android.study.view.ui.TabHostActivity;
import com.xuandexinxi.android.study.view.ui.TableLayoutActivity;
import com.xuandexinxi.android.study.view.ui.TextSwitcherActivity;
import com.xuandexinxi.android.study.view.ui.TextViewActivity;
import com.xuandexinxi.android.study.view.ui.TitleProgressBarActivity;
import com.xuandexinxi.android.study.view.ui.ToastActivity;
import com.xuandexinxi.android.study.view.ui.ToggleButtonActivity;
import com.xuandexinxi.android.study.view.ui.ViewFlipperActivity;
import com.xuandexinxi.android.study.view.ui.ViewSwitcherActivity;

public class MainActivity extends BaseActivity {

	private ExpandableListView lv;

	public String[] groupArray;
	public MyEvent[][] childArray;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		// 这里不能在外部定义变量的时候写入,getString()方法本质上还是getResources().getString(),onCreate方法执行前getResources()是空值
		groupArray = new String[] { getString(R.string._1_menu), getString(R.string._2_menu),
				getString(R.string._3_menu), getString(R.string._4_menu), getString(R.string._5_menu),
				getString(R.string._6_menu), getString(R.string._20_software_description)
		// , getString(R.string._7_menu), getString(R.string._8_menu),
		// getString(R.string._9_menu), getString(R.string._10_menu),
		// getString(R.string._11_menu),
		// getString(R.string._12_menu), getString(R.string._13_menu),
		// getString(R.string._14_menu),
		// getString(R.string._15_menu)
		};
		// 子目录
		childArray = new MyEvent[][] {
				// 第一章
				{ new MyEvent(R.string._1_hello_world_, HelloWorldWorldActivity.class) },
				{ new MyEvent(R.string._2_catalog_code_ui, CodeViewActivity.class),
						new MyEvent(R.string._2_catalog_mix_view, MixViewActivity.class),
						new MyEvent(R.string._2_catalog_custom_view, CustomViewActivity.class),
						new MyEvent(R.string._2_catalog_4, LinearLayoutActivity.class),
						new MyEvent(R.string._2_catalog_5, TableLayoutActivity.class),
						new MyEvent(R.string._2_catalog_6, FrameLayoutActivity.class),
						new MyEvent(R.string._2_catalog_7, RelativeLayoutActivity.class),
						new MyEvent(R.string._2_catalog_8, GridLayoutActivity.class),
						new MyEvent(R.string._2_catalog_9, AbsoluteLayoutActivity.class),
						new MyEvent(R.string._2_catalog_10, TextViewActivity.class),
						new MyEvent(R.string._2_catalog_11, EditTextActivity.class),
						new MyEvent(R.string._2_catalog_12, ButtonActivity.class),
						new MyEvent(R.string._2_catalog_13, CheckButtonActivity.class),
						new MyEvent(R.string._2_catalog_14, ToggleButtonActivity.class),
						new MyEvent(R.string._2_catalog_15, ClockActivity.class),
						new MyEvent(R.string._2_catalog_16, ChronometerActivity.class),
						new MyEvent(R.string._2_catalog_17, ImageViewActivity.class),
						new MyEvent(R.string._2_catalog_18, ImageButtonActivity.class),
						new MyEvent(R.string._2_catalog_19, QuickContactBadgeActivity.class),
						new MyEvent(R.string._2_catalog_20, SimpleListViewActivity.class),
						new MyEvent(R.string._2_catalog_21, ArrayAdapterListViewActivity.class),
						new MyEvent(R.string._2_catalog_22, SimpleAdapterListViewActivity.class),
						new MyEvent(R.string._2_catalog_23, ListViewTithBaseAdapterActivity.class),
						new MyEvent(R.string._2_catalog_24, AutoCompleteTextViewActivity.class),
						new MyEvent(R.string._2_catalog_25, GridViewActivity.class),
						new MyEvent(R.string._2_catalog_26, ExpandableListViewActivity.class),
						new MyEvent(R.string._2_catalog_27, SpinnerActivity.class),
						new MyEvent(R.string._2_catalog_28, AdapterViewFlipperActivity.class),
						new MyEvent(R.string._2_catalog_29, StackViewActivity.class),
						new MyEvent(R.string._2_catalog_30, ProgressBarActivity.class),
						new MyEvent(R.string._2_catalog_31, TitleProgressBarActivity.class),
						new MyEvent(R.string._2_catalog_32, RatingBarActivity.class),
						new MyEvent(R.string._2_catalog_33, SeekBarActivity.class),
						new MyEvent(R.string._2_catalog_34, ViewSwitcherActivity.class),
						new MyEvent(R.string._2_catalog_35, ImageSwitcherActivity.class),
						new MyEvent(R.string._2_catalog_36, TextSwitcherActivity.class),
						new MyEvent(R.string._2_catalog_37, ViewFlipperActivity.class),
						new MyEvent(R.string._2_catalog_38, ToastActivity.class),
						new MyEvent(R.string._2_catalog_39, CalendarViewActivity.class),
						new MyEvent(R.string._2_catalog_40, ChooseDateActivity.class),
						new MyEvent(R.string._2_catalog_41, NumberPickerActivity.class),
						new MyEvent(R.string._2_catalog_42, SearchViewActivity.class),
						new MyEvent(R.string._2_catalog_43, TabHostActivity.class),
						new MyEvent(R.string._2_catalog_44, ScrollViewActivity.class),
						new MyEvent(R.string._2_catalog_45, NotificationActivity.class),
						new MyEvent(R.string._2_catalog_46, AlertDialogActivity.class),
						new MyEvent(R.string._2_catalog_47, DialogThemeActivity.class),
						new MyEvent(R.string._2_catalog_48, PopupWindowActivity.class),
						new MyEvent(R.string._2_catalog_49, DateDialogActivity.class),
						new MyEvent(R.string._2_catalog_50, ProgressDialogActivity.class),
						new MyEvent(R.string._2_catalog_51, MenuActivity.class),
						new MyEvent(R.string._2_catalog_52, ActivityMenuActivity.class),
						new MyEvent(R.string._2_catalog_53, MenuResActivity.class),
						new MyEvent(R.string._2_catalog_54, PopupMenuActivity.class),
						new MyEvent(R.string._2_catalog_55, ContextMenuActivity.class),
						new MyEvent(R.string._2_catalog_56, ActionBarActivity.class),
						new MyEvent(R.string._2_catalog_57, ActionItemActivity.class),
						new MyEvent(R.string._2_catalog_58, ActionHomeActivity.class),
						new MyEvent(R.string._2_catalog_59, ActionViewActivity.class),
						new MyEvent(R.string._2_catalog_60, ActionBarTabNavActivity.class),
						new MyEvent(R.string._2_catalog_61, ActionBarSwipeNavActivity.class),
						new MyEvent(R.string._2_catalog_62, ActionBarDropDownNavActivity.class) },
				{
						new MyEvent(R.string._3_catalog_1, EventQsActivity.class),
						new MyEvent(R.string._3_catalog_2, PlaneActivity.class),
						new MyEvent(R.string._3_catalog_3, SendSmsActivity.class),
						new MyEvent(R.string._3_catalog_4, ActivityListenerActivity.class),
						new MyEvent(R.string._3_catalog_5, AnonymousListenerActivity.class),
						new MyEvent(R.string._3_catalog_6, BindingTagActivity.class),
						new MyEvent(R.string._3_catalog_7, CallbackHandlerActivity.class),
						new MyEvent(R.string._3_catalog_8, PropagationActivity.class),
						new MyEvent(R.string._3_catalog_9,
								com.xuandexinxi.android.study.view.event.CustomViewActivity.class),
						new MyEvent(R.string._3_catalog_10, ConfigurationActivity.class),
						new MyEvent(R.string._3_catalog_11, ChangeCfgActivity.class),
						new MyEvent(R.string._3_catalog_12, HandlerActivity.class),
						new MyEvent(R.string._3_catalog_13, CalPrimeActivity.class),
						new MyEvent(R.string._3_catalog_14, AsyncTaskActivity.class) },
				{ new MyEvent(R.string._4_catalog_1, OtherActivity.class),
						new MyEvent(R.string._4_catalog_2, StartActivity.class),
						new MyEvent(R.string._4_catalog_3, BundleActivity.class),
						new MyEvent(R.string._4_catalog_4, ActivityForResultActivity.class),
						new MyEvent(R.string._4_catalog_5, LifecycleActivity.class),
						new MyEvent(R.string._4_catalog_6, StandardModelActivity.class),
						new MyEvent(R.string._4_catalog_7, SingleTaskActivity.class),
						new MyEvent(R.string._4_catalog_8, SingleInstanceActivity.class),
						new MyEvent(R.string._4_catalog_9, SingleTopActivity.class),
						new MyEvent(R.string._4_catalog_10, OtherTestActivity.class),
						new MyEvent(R.string._4_catalog_11, FragmentTestActivity.class),
						new MyEvent(R.string._4_catalog_12, SeniorFragmentTestActivity.class),
						new MyEvent(R.string._4_catalog_13, FragmentLifecycleActivity.class) },
				{ new MyEvent(R.string._5_catalog_1, ComponentAttrActivity.class),
						new MyEvent(R.string._5_catalog_2, ActionAttrActivity.class),
						new MyEvent(R.string._5_catalog_3, ActionCateAttrActivity.class),
						new MyEvent(R.string._5_catalog_4, SysActionActivity.class),
						new MyEvent(R.string._5_catalog_5, ReturnHomeActivity.class),
						new MyEvent(R.string._5_catalog_6, DataTypeOverrideActivity.class),
						new MyEvent(R.string._5_catalog_7, DataTypeAttrActivity.class),
						new MyEvent(R.string._5_catalog_8, ActionDataActivity.class),
						new MyEvent(R.string._5_catalog_9, IntentTabActivity.class) },
				{ new MyEvent(R.string._6_catalog_1, ValuesResActivity.class),
						new MyEvent(R.string._6_catalog_2, ArrayResActivity.class),
						new MyEvent(R.string._6_catalog_3, StateListDrawableActivity.class),
						new MyEvent(R.string._6_catalog_4, LayerDrawableActivity.class),
						new MyEvent(R.string._6_catalog_5, ShapeDrawableActivity.class),
						new MyEvent(R.string._6_catalog_6, ClipDrawableActivity.class),
						new MyEvent(R.string._6_catalog_7, AnimationDrawableActivity.class),
						new MyEvent(R.string._6_catalog_8, AnimatorActivity.class),
						new MyEvent(R.string._6_catalog_9, XmlResActivity.class),
						new MyEvent(R.string._6_catalog_10, StyleResActivity.class),
						new MyEvent(R.string._6_catalog_11, AttrResActivity.class),
						new MyEvent(R.string._6_catalog_12, RawResActivity.class),
						new MyEvent(R.string._6_catalog_13, DpiSuitActivity.class),
						new MyEvent(R.string._6_catalog_14, ScreenSizeActivity.class) },
				{ new MyEvent(R.string._20_catalog_1, DocumentationActivity.class) } };
		initView();
		initHeader(R.string.app_name);
		btnTopBack.setVisibility(View.GONE);
	}

	private void initView() {
		lv = (ExpandableListView) findViewById(R.id.elv);
		MyExpandListViewAdapter adapter = new MyExpandListViewAdapter(thisActivity, groupArray, childArray);
		lv.setAdapter(adapter);
		// 二级列表子条目点击事件
		lv.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
			@Override
			public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
				startActivity(childArray[groupPosition][childPosition].getActivity());
				return false;
			}

		});
	}

}
