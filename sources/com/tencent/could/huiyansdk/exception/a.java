package com.tencent.could.huiyansdk.exception;

/* JADX INFO: loaded from: classes4.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15628b;

    public a(String str) {
        super(str);
        this.f15627a = -1;
        this.f15628b = str;
    }

    public a(int i, String str) {
        this(str);
        this.f15627a = i;
    }
}
