package X2;

import A7.r;
import android.text.format.DateUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import dOYHB6.yFtIp6.svM7M6;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class j {
    public static final long j = TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f6494k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2.e f6495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B2.b f6496b;
    public final Executor c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Clock f6497d;
    public final Random e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConfigFetchHttpClient f6498g;
    public final o h;
    public final HashMap i;

    public j(C2.e eVar, B2.b bVar, Executor executor, Clock clock, Random random, d dVar, ConfigFetchHttpClient configFetchHttpClient, o oVar, HashMap map) {
        this.f6495a = eVar;
        this.f6496b = bVar;
        this.c = executor;
        this.f6497d = clock;
        this.e = random;
        this.f = dVar;
        this.f6498g = configFetchHttpClient;
        this.h = oVar;
        this.i = map;
    }

    public final Task a(long j6) {
        HashMap map = new HashMap(this.i);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return this.f.b().continueWithTask(this.c, new g(this, j6, map));
    }

    public final i b(String str, String str2, Date date, HashMap map) {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.f6498g.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f6498g;
            HashMap mapE = e();
            String string = svM7M6.getString(this.h.f6518a, "last_fetch_etag", null);
            Y1.b bVar = (Y1.b) this.f6496b.get();
            i iVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapE, string, map, bVar != null ? (Long) ((Y1.c) bVar).f6730a.getUserProperties(null, null, true).get("_fot") : null, date, this.h.b());
            f fVar = iVarFetch.f6493b;
            if (fVar != null) {
                o oVar = this.h;
                long j6 = fVar.f;
                synchronized (oVar.f6519b) {
                    oVar.f6518a.edit().putLong("last_template_version", j6).apply();
                }
            }
            String str4 = iVarFetch.c;
            if (str4 != null) {
                this.h.e(str4);
            }
            this.h.d(0, o.f);
            return iVarFetch;
        } catch (FirebaseRemoteConfigServerException e) {
            int i = e.f9862a;
            o oVar2 = this.h;
            if (i == 429 || i == 502 || i == 503 || i == 504) {
                int i4 = oVar2.a().f6516a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f6494k;
                long millis = timeUnit.toMillis(iArr[Math.min(i4, iArr.length) - 1]);
                oVar2.d(i4, new Date(date.getTime() + (millis / 2) + ((long) this.e.nextInt((int) millis))));
            }
            n nVarA = oVar2.a();
            int i6 = e.f9862a;
            if (nVarA.f6516a > 1 || i6 == 429) {
                nVarA.f6517b.getTime();
                throw new FirebaseRemoteConfigFetchThrottledException("Fetch was throttled.");
            }
            if (i6 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i6 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i6 == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i6 != 500) {
                    switch (i6) {
                        case TypedValues.PositionType.TYPE_DRAWPATH /* 502 */:
                        case TypedValues.PositionType.TYPE_PERCENT_WIDTH /* 503 */:
                        case TypedValues.PositionType.TYPE_PERCENT_HEIGHT /* 504 */:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new FirebaseRemoteConfigServerException(e.f9862a, "Fetch failed: ".concat(str3), e);
        }
    }

    public final Task c(Task task, long j6, HashMap map) {
        Task taskContinueWithTask;
        Date date = new Date(this.f6497d.currentTimeMillis());
        boolean zIsSuccessful = task.isSuccessful();
        o oVar = this.h;
        if (zIsSuccessful) {
            Date date2 = new Date(oVar.f6518a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(o.e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j6) + date2.getTime()))) {
                return Tasks.forResult(new i(2, null, null));
            }
        }
        Date date3 = oVar.a().f6517b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            taskContinueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(str));
        } else {
            C2.d dVar = (C2.d) this.f6495a;
            Task taskD = dVar.d();
            Task taskE = dVar.e();
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskD, taskE}).continueWithTask(executor, new h(this, taskD, taskE, date, map));
        }
        return taskContinueWithTask.continueWithTask(executor, new r(21, this, date));
    }

    public final Task d(int i) {
        HashMap map = new HashMap(this.i);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i);
        return this.f.b().continueWithTask(this.c, new r(22, this, map));
    }

    public final HashMap e() {
        HashMap map = new HashMap();
        Y1.b bVar = (Y1.b) this.f6496b.get();
        if (bVar != null) {
            for (Map.Entry<String, Object> entry : ((Y1.c) bVar).f6730a.getUserProperties(null, null, false).entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
