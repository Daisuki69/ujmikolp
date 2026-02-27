package com.paymaya.common.utility;

import android.R;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.androidadvance.topsnackbar.TSnackbar$SnackbarLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j0 {
    public static void a(FragmentActivity fragmentActivity, int i) {
        boolean zE;
        if (fragmentActivity != null) {
            View viewFindViewById = fragmentActivity.findViewById(R.id.content);
            Handler handler = C.m.f661d;
            C.m mVarC = C.m.c(viewFindViewById, viewFindViewById.getResources().getText(i));
            TSnackbar$SnackbarLayout tSnackbar$SnackbarLayout = mVarC.f663b;
            tSnackbar$SnackbarLayout.c = 3000;
            tSnackbar$SnackbarLayout.setBackgroundColor(ContextCompat.getColor(fragmentActivity, com.paymaya.R.color.primary_dark));
            TextView textView = (TextView) tSnackbar$SnackbarLayout.findViewById(com.paymaya.R.id.snackbar_text);
            textView.setTextColor(ContextCompat.getColor(fragmentActivity, R.color.white));
            textView.setGravity(17);
            com.google.firebase.messaging.r rVarS = com.google.firebase.messaging.r.s();
            C.f fVar = mVarC.c;
            synchronized (rVarS.f9803b) {
                zE = rVarS.E(fVar);
            }
            if (zE) {
                mVarC.b(3);
            }
            mVarC.e();
        }
    }
}
