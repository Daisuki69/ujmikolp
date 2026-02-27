package com.tencent.could.huiyansdk.permission;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes4.dex */
public class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f15710a;

    public b(c cVar) {
        this.f15710a = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f15710a.a();
        ((com.tencent.could.huiyansdk.fragments.a) this.f15710a.f15712b).a();
        this.f15710a.b();
    }
}
