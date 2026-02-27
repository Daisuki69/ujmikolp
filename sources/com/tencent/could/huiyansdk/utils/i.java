package com.tencent.could.huiyansdk.utils;

import com.tencent.could.huiyansdk.manager.e;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f15742a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f15743a = new i();
    }

    public i() {
        a();
    }

    public final void a() {
        this.f15742a = new ThreadPoolExecutor(8, 64, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.CallerRunsPolicy());
    }

    public void a(Runnable runnable) {
        if (this.f15742a.isShutdown()) {
            e.a.f15688a.a(2, "ThreadPoolUtil", "thread pool is ready shutdown!");
        } else {
            this.f15742a.execute(runnable);
        }
    }
}
