package com.tencent.could.huiyansdk.fragments;

import G7.p;
import a7.RunnableC0661v;
import android.content.Context;
import android.graphics.Paint;
import android.widget.TextView;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.common.a;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.view.LoadingFrontAnimatorView;

/* JADX INFO: loaded from: classes4.dex */
public class f implements com.tencent.could.huiyansdk.callback.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AuthingFragment f15653a;

    public f(AuthingFragment authingFragment) {
        this.f15653a = authingFragment;
    }

    public void a(Context context, int i, HuiYanAuthTipsEvent huiYanAuthTipsEvent) {
        if (context == null) {
            e.a.f15688a.a(2, "AuthingFragment", "context is null!");
            return;
        }
        if (this.f15653a.f15641t) {
            return;
        }
        if (-1 == i) {
            AuthingFragment authingFragment = this.f15653a;
            int i4 = authingFragment.f15644w;
            if (i4 < 20) {
                authingFragment.f15644w = i4 + 1;
                return;
            }
            authingFragment.f15644w = 0;
        }
        this.f15653a.runOnUiThread(new androidx.work.impl.b(22, this, huiYanAuthTipsEvent, i == -1 ? "" : this.f15653a.getContextResources().getString(i)));
    }

    public void b(int i) {
        this.f15653a.runOnUiThread(new p(this, i, 8));
    }

    public void a(String str, int i) {
        this.f15653a.runOnUiThread(new RunnableC0661v(this, i, str, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        TextView textView = this.f15653a.c;
        if (textView != null) {
            textView.setTextColor(i);
            a.C0082a.f15626a.f15624b = str;
            this.f15653a.c.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HuiYanAuthTipsEvent huiYanAuthTipsEvent, String str) {
        if (this.f15653a.f15631d == null) {
            return;
        }
        j.a.f15618a.a(huiYanAuthTipsEvent, true);
        this.f15653a.f15637p.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Paint paint;
        AuthingFragment authingFragment = this.f15653a;
        if (authingFragment.i == null || authingFragment.f15645x) {
            return;
        }
        LoadingFrontAnimatorView loadingFrontAnimatorView = this.f15653a.i;
        if (i == loadingFrontAnimatorView.f15782g || (paint = loadingFrontAnimatorView.j) == null) {
            return;
        }
        loadingFrontAnimatorView.f15782g = i;
        paint.setColor(i);
        loadingFrontAnimatorView.invalidate();
    }
}
