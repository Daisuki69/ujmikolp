package androidx.sqlite.util;

import android.util.Log;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ProcessLock {
    private static final String TAG = "SupportSQLiteLock";
    private FileChannel lockChannel;
    private final File lockFile;
    private final boolean processLock;
    private final Lock threadLock;
    public static final Companion Companion = new Companion(null);
    private static final Map<String, Lock> threadLocksMap = new HashMap();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock getThreadLock(String str) {
            Lock lock;
            synchronized (ProcessLock.threadLocksMap) {
                try {
                    Map map = ProcessLock.threadLocksMap;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lock;
        }

        private Companion() {
        }
    }

    public ProcessLock(String name, File file, boolean z4) {
        j.g(name, "name");
        this.processLock = z4;
        this.lockFile = file != null ? new File(file, name.concat(".lck")) : null;
        this.threadLock = Companion.getThreadLock(name);
    }

    public static /* synthetic */ void lock$default(ProcessLock processLock, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z4 = processLock.processLock;
        }
        processLock.lock(z4);
    }

    public final void lock(boolean z4) {
        this.threadLock.lock();
        if (z4) {
            try {
                File file = this.lockFile;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.lockFile).getChannel();
                channel.lock();
                this.lockChannel = channel;
            } catch (IOException e) {
                this.lockChannel = null;
                Log.w(TAG, "Unable to grab file lock.", e);
            }
        }
    }

    public final void unlock() {
        try {
            FileChannel fileChannel = this.lockChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.threadLock.unlock();
    }
}
