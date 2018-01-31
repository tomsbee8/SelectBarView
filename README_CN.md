## SelecBarView

--------
[![Build Status](https://www.travis-ci.org/tomsbee8/SelectBarView.svg?branch=master)](https://www.travis-ci.org/tomsbee8/SelectBarView)[ ![Download](https://api.bintray.com/packages/blinkdagger/SelectBarView/SelectBarView/images/download.svg) ](https://bintray.com/blinkdagger/SelectBarView/SelectBarView/_latestVersion)
SelectBarView是一个可以水平切换的菜单,可以自定义边框的宽度、颜色 、圆角和item文字、背景的属性以及分割线的宽度、颜色等。每个Item还可以设置小圆点标记提醒 

![企业微信截图_388fa136-c0d9-4160-ab37-d1fba1d5bcbb]($res/%E4%BC%81%E4%B8%9A%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_388fa136-c0d9-4160-ab37-d1fba1d5bcbb.png)
![企业微信截图_ecc8ba33-a041-46ff-86f7-0acfff1f73e9]($res/%E4%BC%81%E4%B8%9A%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_ecc8ba33-a041-46ff-86f7-0acfff1f73e9.png)





 1. 在build.gradle中加入：

```
compile 'cn.blinkdagger.selectbarview:selectbarview:1.0'
```
2. 在xml中：

```
 <cn.blinkdagger.selectbarview.SelectBarView
        android:id="@+id/main_select_bar"
        android:layout_width="match_parent"
        android:layout_height="32dp"
        android:layout_marginLeft="20dp"
        android:layout_marginRight="20dp"
        android:layout_marginTop="15dp"
        app:bgColor="@android:color/white"
        app:borderColor="@color/colorGreen"
        app:borderRadius="16dp"
        app:borderWidth="1dp"
        app:checkedBgColor="@color/colorGreen"
        app:checkedTextColor="@android:color/white"
        app:splitLineColor="@color/colorGreen"
        app:splitLineWidth="1dp"
        app:textColor="@color/colorGreen"
        app:dotColor="@color/colorAccent"
        app:dotRadius="4dp"
        app:textSize="13sp" />
```
3. 在代码中的设置：
- setItems(String[] items)：设置item的文字
- setItemChecked( int checkedIndex)：设置选择item
- setOnItemCheckedChangeListener()：设置item 切换事件监听
- setItemDotVisible(int index, boolean visible)：设置item 中的小圆点提醒是否显示


4. 详细属性：


```
        <attr name="borderColor" format="color" /><!--边框颜色-->
        <attr name="borderWidth" format="dimension" /><!--边框宽度-->
        <attr name="borderRadius" format="dimension" /><!--边框圆角半径-->
        <attr name="bgColor" format="color" /><!--未选中的Item的背景颜色-->
        <attr name="checkedBgColor" format="color" /><!--选中的Item的背景颜色-->
        <attr name="textColor" format="color" /><!--未选中的Item的背景颜色-->
        <attr name="checkedTextColor" format="color" /><!--选中的Item的文字颜色-->
        <attr name="textSize" format="dimension" /><!--未选中的Item的文字大小-->
        <attr name="checkedTextSize" format="dimension" /><!--选中的Item的文字大小-->
        <attr name="splitLineColor" format="color" /><!--分割线的颜色-->
        <attr name="splitLineWidth" format="dimension" /><!--分割线的宽度-->
        <attr name="dotColor" format="color" /><!--提醒圆点的颜色-->
        <attr name="dotRadius" format="dimension" /><!--提醒圆点的半径-->
```
具体使用参见[Sample](https://github.com/tomsbee8/SelectBarView/tree/master/sample)






