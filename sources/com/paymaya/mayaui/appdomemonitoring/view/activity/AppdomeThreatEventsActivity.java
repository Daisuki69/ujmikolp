package com.paymaya.mayaui.appdomemonitoring.view.activity;

import N5.C0447e;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBindings;
import cj.C1129o;
import cj.t;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.kKDWJ7;
import fa.ViewOnClickListenerC1479a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.j;
import u5.b;
import uj.AbstractC2324c;
import yk.a;

/* JADX INFO: loaded from: classes4.dex */
public final class AppdomeThreatEventsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static final /* synthetic */ int f = 0;
    public C0447e c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f11526d = C1129o.z(b.values());
    public b e;

    public static final void g1(AppdomeThreatEventsActivity appdomeThreatEventsActivity) {
        a.f();
        b bVar = appdomeThreatEventsActivity.e;
        if (bVar != null) {
            String str = bVar.f20271a;
            Intent intent = new Intent(str);
            intent.setPackage(appdomeThreatEventsActivity.getPackageName());
            intent.setFlags(32);
            AbstractC2324c.f20347a.getClass();
            intent.putExtra(numX49.tnTj78("btMP"), String.valueOf(AbstractC2324c.f20348b.e(1000, 9999)));
            intent.putExtra(numX49.tnTj78("btMb"), str);
            intent.putExtra(numX49.tnTj78("btM2"), System.currentTimeMillis());
            String string = UUID.randomUUID().toString();
            j.f(string, numX49.tnTj78("btML"));
            String upperCase = AbstractC1213b.M(numX49.tnTj78("btMr"), string, numX49.tnTj78("btMZ")).toUpperCase(Locale.ROOT);
            j.f(upperCase, numX49.tnTj78("btMk"));
            intent.putExtra(numX49.tnTj78("btMB"), upperCase);
            kKDWJ7.sendBroadcast(appdomeThreatEventsActivity.getApplicationContext(), intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_appdome_threat_events, (ViewGroup) null, false);
        int i = R.id.get_threats_button;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.get_threats_button);
        if (button != null) {
            i = R.id.select_threat_spinner;
            Spinner spinner = (Spinner) ViewBindings.findChildViewById(viewInflate, R.id.select_threat_spinner);
            if (spinner != null) {
                i = R.id.text_view_data;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_data);
                if (textView != null) {
                    i = R.id.trigger_threat_button;
                    Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.trigger_threat_button);
                    if (button2 != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        this.c = new C0447e(linearLayout, button, spinner, textView, button2);
                        setContentView(linearLayout);
                        List list = this.f11526d;
                        ArrayList arrayList = new ArrayList(t.l(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((b) it.next()).toString());
                        }
                        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayList);
                        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        C0447e c0447e = this.c;
                        j.d(c0447e);
                        ((Spinner) c0447e.e).setAdapter((SpinnerAdapter) arrayAdapter);
                        C0447e c0447e2 = this.c;
                        j.d(c0447e2);
                        ((Spinner) c0447e2.e).setOnItemSelectedListener(this);
                        C0447e c0447e3 = this.c;
                        j.d(c0447e3);
                        Ke.b.b((Button) c0447e3.c, new W4.b(this, 19));
                        C0447e c0447e4 = this.c;
                        j.d(c0447e4);
                        ((Button) c0447e4.f4080d).setOnClickListener(new ViewOnClickListenerC1479a(this, 2));
                        return;
                    }
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("btMu").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Callback.onItemSelected_enter(view, i);
        try {
            a.a();
            this.e = (b) this.f11526d.get(i);
            a.a();
        } finally {
            Callback.onItemSelected_exit();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        super.onStop();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zZN5YC5 = hxOD26.zN5YC5(motionEvent);
        return !zZN5YC5 ? super.onTouchEvent(motionEvent) : zZN5YC5;
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        iKNpI8.fBndJ9(this);
        super.onUserInteraction();
    }
}
