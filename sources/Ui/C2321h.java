package ui;

import io.split.android.client.dtos.TargetingRulesChange;
import java.util.concurrent.locks.ReentrantLock;
import l9.C1803a;

/* JADX INFO: renamed from: ui.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2321h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f20345a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile TargetingRulesChange f20346b = null;
    public volatile boolean c = false;

    public final void a(C1803a c1803a) {
        this.f20345a.lock();
        try {
            if (!this.c) {
                this.f20346b = c1803a.c();
            }
        } finally {
            this.f20345a.unlock();
        }
    }
}
