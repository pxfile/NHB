package com.nhb.app.custom.viewmodel.interfaces;

import android.databinding.ObservableField;
import android.support.annotation.DrawableRes;
import android.view.View;

/**
 * <p>***********************************************************************
 * <p> Author: pengxiaofang
 * <p> CreateData: 2016-06-08 16:28
 * <p> Version: 1.0
 * <p> Description: 右上角带图片按钮的顶部栏(含返回按钮)
 * <p>
 * <p>***********************************************************************
 */
public interface ITitleBarRightImage {

	/**
	 * 标题文案
	 * @return
	 */
	ObservableField<String> getTitle();

	/**
	 * 返回按钮点击
	 * @param view
	 */
	void clickFinish(View view);

	/**
	 * 返回右上角 按钮 icon
	 * 若 return null or 0, 隐藏 右上角按钮
	 * @return 资源文件id R.drawable
	 */
	@DrawableRes
	int getRightBtnSrc();

	/**
	 * 右上角 icon按钮点击
	 * @param view
	 */
	void clickRightImg(View view);
}
