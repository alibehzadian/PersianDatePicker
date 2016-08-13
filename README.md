PersianDatePicker
=========

An Android DatePicker for Persian Calendar

Usage:
---

  - Add as an Android Library Project:
   - Add this line to root layout element:
   <pre><code>xmlns:persianDatePicker="http://schemas.android.com/apk/res-auto"</code></pre>
   - Add PersianDatePicker view:
   <pre><code>&lt;ir.smartlab.persindatepicker.PersianDatePicker
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/&gt;</code></pre>
  - Add Source and other required things to your Project:
   - Copy all sources to your source tree.
   - Copy /res/layout/sl_persian_date_picker.xml to your /res/layout folder.
   - Add this to your /res/values/attrs.xml:
   <pre><code>&lt;declare-styleable name="PersianDatePicker"&gt;
        &lt;attr name="minYear" format="integer" /&gt;
        &lt;attr name="maxYear" format="integer" /&gt;
        &lt;attr name="selectedYear" format="integer" /&gt;
        &lt;attr name="selectedMonth" format="integer" /&gt;
        &lt;attr name="selectedDay" format="integer" /&gt;
        &lt;attr name="displayMonthNames" format="boolean" /&gt;
        &lt;attr name="yearRange" format="integer" /&gt;
    &lt;/declare-styleable&gt;</code></pre>

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
   <pre><code>&lt;ir.smartlab.persindatepicker.PersianDatePicker
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/&gt;</code></pre>
   - Display a PersianDatePicker with selected Hijri Shamsi (Jalali) date:
    <pre><code>&lt;ir.smartlab.persindatepicker.PersianDatePicker
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:selectedYear="1390"
        app:selectedMonth="5"
        app:selectedDay="15" /&gt;</code></pre>
   - Display a PersianDatePicker that shows month names:
   <pre><code>&lt;ir.smartlab.persindatepicker.PersianDatePicker
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:displayMonthNames="true" /&gt;</code></pre>
   - Display a PersianDatePicker that shows years between 1350 and 1450:
   <pre><code>&lt;ir.smartlab.persindatepicker.PersianDatePicker
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:maxYear="1450"
        app:minYear="1350" /&gt;</code></pre>

Java Examples:
---
- You can set a java.util.Date object to PersianDatePpicker in java code:
<pre><code>persianDatePicker.setDisplayDate(new Date());</code></pre>
- you can also set a ir.smartlab.persindatepicker.util.PersianCalendar object:
<pre><code>PersianCalendar persianCalendar = new PersianCalendar();
persianCalendar.setPersianDate(1393, 6, 28);
persianDatePicker.setDisplayPersianDate(persianCalendar);</code></pre>
- You can get displayed date in java.util.Date or ir.smartlab.persindatepicker.util.PersianCalendar:
<pre><code>Date d = persianDatePicker.getDisplayDate();
// OR
PersianCalendar pCal = persianDatePicker.getDisplayPersianDate();</code></pre>

Leap Year:
---
In Hijri Shamsi some years are leap year, so the last month of year is 30 days (not 29 days). PersianDatePicker take cares of leap years. This means that users will never pick a wrong date.

To Do:
---
* Support Persian digits as an option
* Support typeface settings

Credits:
---
PersianDatepicker is heavily based on AOSP (https://source.android.com) and PersianCalendar (http://sourceforge.net/projects/persiancalendar).

Version
----
1.0

License
----
Apache License Version 2.0
