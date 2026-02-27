package com.tencent.could.huiyansdk.fragments;

import G7.p;
import com.tencent.could.huiyansdk.R;

/* JADX INFO: loaded from: classes4.dex */
public class c implements com.tencent.could.huiyansdk.callback.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AuthingFragment f15650a;

    public c(AuthingFragment authingFragment) {
        this.f15650a = authingFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(int i) {
        this.f15650a.e.setText(i + this.f15650a.getResString(R.string.txy_count_down_txt));
    }

    public void a(int i) {
        this.f15650a.runOnUiThread(new p(this, i, 7));
    }
}
