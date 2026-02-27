package com.tencent.could.component.common.ai.log;

import com.tencent.could.component.common.ai.utils.SimplePool;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SimplePool<d> f15560a = new SimplePool<>(30, "LogInfoPool");

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f15561a = new e();
    }

    public void a(d dVar) {
        dVar.f15557a = 2;
        dVar.f15558b = 0L;
        dVar.c = "";
        dVar.f15559d = "";
        dVar.e = "";
        dVar.f = "";
        synchronized (e.class) {
            this.f15560a.release(dVar);
        }
    }
}
