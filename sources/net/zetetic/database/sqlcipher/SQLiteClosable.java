package net.zetetic.database.sqlcipher;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SQLiteClosable implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18646a = 1;

    public final void b() {
        synchronized (this) {
            try {
                int i = this.f18646a;
                if (i <= 0) {
                    throw new IllegalStateException("attempt to re-open an already-closed object: " + this);
                }
                this.f18646a = i + 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f();
    }

    public final void f() {
        boolean z4;
        synchronized (this) {
            z4 = true;
            int i = this.f18646a - 1;
            this.f18646a = i;
            if (i != 0) {
                z4 = false;
            }
        }
        if (z4) {
            c();
        }
    }
}
