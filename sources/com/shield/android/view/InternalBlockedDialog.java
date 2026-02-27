package com.shield.android.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.R;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public class InternalBlockedDialog extends Activity {
    private boolean jS = ((int) f15505d[0]) ^ 559665998;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15505d = {559665999, 908949460, 536458851, 1146922131, 329038609, 385525582};
    public static String TITLE = f(numX49.tnTj78("bOCP"));
    public static String BODY = f(numX49.tnTj78("bOCb"));

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15505d[1]) ^ 908949460;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15505d;
            long j = jArr[4];
            long j6 = jArr[0];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 329038905) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 329038905)) + (((int) j6) ^ 559665998), (~(((int) j) ^ 329038905)) | i4, i6, (((((int) j) ^ 329038905) + cCharAt) + (((int) j6) ^ 559665998)) + ((~(((int) j) ^ 329038905)) | i4)) ^ (i % (((int) jArr[5]) ^ 385505457))));
            long j7 = f15505d[0];
            int i10 = ~i;
            i = i + (((int) j7) ^ 559665998) + (((int) j7) ^ 559665998) + ((~(((int) j7) ^ 559665998)) | i10) + (((((int) j7) ^ 559665998) + i) - ((((((int) j7) ^ 559665998) + i) + (((int) j7) ^ 559665998)) + ((~(((int) j7) ^ 559665998)) | i10)));
        }
        return sb2.toString();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.dialog_blocked);
        TextView textView = (TextView) findViewById(R.id.title);
        TextView textView2 = (TextView) findViewById(R.id.subtitle);
        setFinishOnTouchOutside(((int) f15505d[1]) ^ 908949460);
        if (getIntent() != null) {
            if (getIntent().getStringExtra(TITLE) != null && getIntent().getStringExtra(TITLE).length() > 0) {
                textView.setText(getIntent().getStringExtra(TITLE));
            }
            if (getIntent().getStringExtra(BODY) != null && getIntent().getStringExtra(BODY).length() > 0) {
                textView2.setText(getIntent().getStringExtra(BODY));
            }
            this.jS = getIntent().getBooleanExtra(f(numX49.tnTj78("bOC2")), ((int) f15505d[1]) ^ 908949460);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getBooleanExtra(f(numX49.tnTj78("bOCL")), ((int) f15505d[1]) ^ 908949460)) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        if (this.jS) {
            int i = Build.VERSION.SDK_INT;
            long[] jArr = f15505d;
            if (i >= (((int) jArr[2]) ^ 536458870)) {
                finishAndRemoveTask();
            } else if (i >= (((int) jArr[3]) ^ 1146922115)) {
                finishAffinity();
            } else {
                finish();
            }
        }
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
