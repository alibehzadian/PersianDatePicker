PersianDatePicker
=================

<h1>An Android DatePicker for Persian Calendar</h1>

<h2>Usage:<h2>

1- Add as an Android Library Project:<br/>
Add this library project to your project. In your layout file:

1-1- Add this line to root layout element:<br/>
<pre><code>xmlns:persianDatePicker="http://schemas.android.com/apk/res-auto"</code></pre>

1-2- Add PersianDatePicker view:<br/>
    <pre><code>&lt;ir.smartlab.persindatepicker.PersianDatePicker
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/&gt;</code></pre>
        
2- Add Source and other required things to your Project:<br/>
2-1- Copy all sources to your source tree.<br/>
2-2- Copy /res/layout/sl_persian_date_picker.xml to your /res/layout folder.<br/>
2-3- Add this to your /res/values/attrs.xml:<br/>
    <pre><code>&lt;declare-styleable name="PersianDatePicker"&gt;
        &lt;attr name="minYear" format="integer" /&gt;
        &lt;attr name="maxYear" format="integer" /&gt;
        &lt;attr name="selectedYear" format="integer" /&gt;
        &lt;attr name="selectedMonth" format="integer" /&gt;
        &lt;attr name="selectedDay" format="integer" /&gt;
        &lt;attr name="displayMonthNames" format="boolean" /&gt;
        &lt;attr name="yearRange" format="integer" /&gt;
    &lt;/declare-styleable&gt;</code></pre>
    
<h2>Params:</h2>
1- minYear: Min value for year in the picker. Default is current Hijri Shamsi (Jalali) year - yearRange(default is 10).<br/>
2- maxYear: Max value for year in the picker. Default is current Hijri Shamsi (Jalali) year + yearRange(default is 10).<br/>
3- yearRange: If you set a selected year, available years in picker will be from (selectedYear - yearRange) to (selectedYear + yearRange). Default value is 10.<br/>
4- selectedYear: Selected year that PersianDatePicker starts with. Default is the current Hijri Shamsi (Jalali) year.<br/>
5- selectedMonth: Selected month that PersianDatePicker starts with. Default is the current Hijri Shamsi (Jalali) year's month.<br/>
6- selectedDay: Selected day of month that PersianDatePicker starts with. Default is the current Hijri Shamsi (Jalali) month's day. <br/>
7- displayMonthNames: If set to true, months names are displayed, otherwise their number will be shown.<br/>

<h2>Examples:</h2>
1- Display a PersianDatePicker with current Hijri Shamsi (Jalali) values:<br/>
    <pre><code>&lt;ir.smartlab.persindatepicker.PersianDatePicker
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/&gt;</code></pre>
        
2- Display a PersianDatePicker with selected Hijri Shamsi (Jalali) date:<br/>
    <pre><code>&lt;ir.smartlab.persindatepicker.PersianDatePicker
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:selectedYear="1390"
        app:selectedMonth="5"
        app:selectedDay="15" /&gt;</code></pre>
  
3- Display a PersianDatePicker that shows month names:<br/>
    <pre><code>&lt;ir.smartlab.persindatepicker.PersianDatePicker
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:displayMonthNames="true" /&gt;</code></pre>
        
4- Display a PersianDatePicker that shows years between 1350 and 1450:<br/>
     <pre><code>&lt;ir.smartlab.persindatepicker.PersianDatePicker
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:maxYear="1450"
        app:minYear="1350" /&gt;</code></pre>
        
<h2>Java code:</h2>
1- You can set a java.util.Date object to PersianDatePpicker in java code:<br/>
    <pre><code>persianDatePicker.setDisplayDate(new Date());</code></pre>
    
2- you can also set a ir.smartlab.persindatepicker.util.PersianCalendar object:<br/>
    <pre><code>PersianCalendar persianCalendar = new PersianCalendar();
    persianCalendar.setPersianDate(1393, 6, 28);
    persianDatePicker.setDisplayPersianDate(persianCalendar);</code></pre>
		
3- You can get displayed date in java.util.Date or ir.smartlab.persindatepicker.util.PersianCalendar:<br/>
    <pre><code>Date d = persianDatePicker.getDisplayDate();</code></pre>
    or<br/>
    <pre><code>PersianCalendar pCal = persianDatePicker.getDisplayPersianDate();</code></pre><br/>

<h2>Leap Year:</h2>
In Hijri Shamsi some years are leap year, so the last month of year is 30 days (not 29 days). <br/>
PersianDatePicker take cares of leap years. This means that users will never pick a wrong date.<br/>

Credits:<br/>
PersianDatepicker is heavily based on AOSP (https://source.android.com) and PersianCalendar (http://sourceforge.net/projects/persiancalendar).

