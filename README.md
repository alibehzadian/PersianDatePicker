PersianDatePicker
=========

An Android DatePicker for Persian Calendar

Usage:
---

  - Add as an Android Library Project:
   - Add this line to root layout element:
   ```xml
xmlns:persianDatePicker="http://schemas.android.com/apk/res-auto"
```
   - Add PersianDatePicker view:
   ```xml
<ir.smartlab.persindatepicker.PersianDatePicker
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```
  - Add Source and other required things to your Project:
   - Copy all sources to your source tree.
   - Copy /res/layout/sl_persian_date_picker.xml to your /res/layout folder.
   - Add this to your /res/values/attrs.xml:
```xml
    <declare-styleable name="PersianDatePicker">
        <attr name="minYear" format="integer" />
        <attr name="maxYear" format="integer" />
        <attr name="selectedYear" format="integer" />
        <attr name="selectedMonth" format="integer" />
        <attr name="selectedDay" format="integer" />
        <attr name="displayMonthNames" format="boolean" />
        <attr name="yearRange" format="integer" />
        <attr name="displayDescription" format="boolean" />
		<attr name="disableSoftKeyboard" format="boolean" />
    </declare-styleable>
```

Params:
---
 - minYear: Min value for year in the picker. Default is current Hijri Shamsi (Jalali) year - yearRange(default is 10).
 - maxYear: Max value for year in the picker. Default is current Hijri Shamsi (Jalali) year + yearRange(default is 10).
 - yearRange: If you set a selected year, available years in picker will be from (selectedYear - yearRange) to (selectedYear + yearRange). Default value is 10.
 - selectedYear: Selected year that PersianDatePicker starts with. Default is the current Hijri Shamsi (Jalali) year.
 - selectedMonth: Selected month that PersianDatePicker starts with. Default is the current Hijri Shamsi (Jalali) year's month.
 - selectedDay: Selected day of month that PersianDatePicker starts with. Default is the current Hijri Shamsi (Jalali) month's day.
 - displayMonthNames: If set to true, months names are displayed, otherwise their number will be shown.
 - displayDescription: If set to true, a TextView below datepicker will show the selected date with more details.

Examples:
---
   - Display a PersianDatePicker with current Hijri Shamsi (Jalali) values:
```xml
<ir.smartlab.persindatepicker.PersianDatePicker
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```
   - Display a PersianDatePicker with selected Hijri Shamsi (Jalali) date:
```xml
<ir.smartlab.persindatepicker.PersianDatePicker
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:selectedYear="1390"
    app:selectedMonth="5"
    app:selectedDay="15" />
```
   - Display a PersianDatePicker that shows month names:
```xml
<ir.smartlab.persindatepicker.PersianDatePicker
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:displayMonthNames="true" />
```
   - Display a PersianDatePicker that shows years between 1350 and 1450:
```xml
<ir.smartlab.persindatepicker.PersianDatePicker
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:maxYear="1450"
    app:minYear="1350" />
```

Java Examples:
---
- You can set a java.util.Date object to PersianDatePpicker in java code:
```java
persianDatePicker.setDisplayDate(new Date());
```
- you can also set a ir.smartlab.persindatepicker.util.PersianCalendar object:
```java
PersianCalendar persianCalendar = new PersianCalendar();
persianCalendar.setPersianDate(1393, 6, 28);
persianDatePicker.setDisplayPersianDate(persianCalendar);
```
- You can get displayed date in java.util.Date or ir.smartlab.persindatepicker.util.PersianCalendar:
```java
Date d = persianDatePicker.getDisplayDate();
// OR
PersianCalendar pCal = persianDatePicker.getDisplayPersianDate();
```

Leap Year:
---
In Hijri Shamsi some years are leap year, so the last month of year is 30 days (not 29 days). PersianDatePicker take cares of leap years. This means that users will never pick a wrong date.

Credits:
---
PersianDatepicker is heavily based on AOSP (https://source.android.com) and PersianCalendar (https://github.com/mortezaadi/persian-calendar).

Version
----
1.0

License
----
Apache License Version 2.0
