package R2;

import U2.j;
import U2.k;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.dynatrace.android.agent.Global;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final M2.a f5435g = M2.a.d();
    public static final long h = TimeUnit.SECONDS.toMicros(1);
    public ScheduledFuture e = null;
    public long f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f5436a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f5437b = Executors.newSingleThreadScheduledExecutor();
    public final String c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5438d = Os.sysconf(OsConstants._SC_CLK_TCK);

    public final synchronized void a(long j, Timer timer) {
        this.f = j;
        try {
            this.e = this.f5437b.scheduleAtFixedRate(new a(this, timer, 0), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            f5435g.f("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    public final k b(Timer timer) {
        long j = this.f5438d;
        M2.a aVar = f5435g;
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.c));
            try {
                long jA = timer.a() + timer.f9858a;
                String[] strArrSplit = bufferedReader.readLine().split(Global.BLANK);
                long j6 = Long.parseLong(strArrSplit[13]);
                long j7 = Long.parseLong(strArrSplit[15]);
                long j9 = Long.parseLong(strArrSplit[14]);
                long j10 = Long.parseLong(strArrSplit[16]);
                j jVarV = k.v();
                jVarV.i();
                k.s((k) jVarV.f10116b, jA);
                double d10 = (j9 + j10) / j;
                long j11 = h;
                long jRound = Math.round(d10 * j11);
                jVarV.i();
                k.u((k) jVarV.f10116b, jRound);
                long jRound2 = Math.round(((j6 + j7) / j) * j11);
                jVarV.i();
                k.t((k) jVarV.f10116b, jRound2);
                k kVar = (k) jVarV.g();
                bufferedReader.close();
                return kVar;
            } finally {
            }
        } catch (IOException e) {
            aVar.f("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e7) {
            e = e7;
            aVar.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e10) {
            e = e10;
            aVar.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e11) {
            e = e11;
            aVar.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }
}
