package com.squareup.wire.internal;

import androidx.media3.common.PlaybackException;
import com.dynatrace.android.agent.Global;
import com.shield.android.internal.j;
import java.time.Duration;
import java.util.Arrays;
import okhttp3.internal.http2.Http2Connection;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class DurationJsonFormatter implements JsonFormatter<Duration> {
    public static final DurationJsonFormatter INSTANCE = new DurationJsonFormatter();

    private DurationJsonFormatter() {
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public /* bridge */ /* synthetic */ Object toStringOrNumber(Duration duration) {
        return toStringOrNumber2(j.p(duration));
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Duration fromString(String value) {
        int i;
        kotlin.jvm.internal.j.g(value, "value");
        int iE = C2576A.E(value, 's', 0, 6);
        if (iE != value.length() - 1) {
            throw new NumberFormatException();
        }
        int iE2 = C2576A.E(value, '.', 0, 6);
        if (iE2 == -1) {
            String strSubstring = value.substring(0, iE);
            kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
            Duration durationOfSeconds = Duration.ofSeconds(Long.parseLong(strSubstring));
            kotlin.jvm.internal.j.f(durationOfSeconds, "ofSeconds(...)");
            return durationOfSeconds;
        }
        String strSubstring2 = value.substring(0, iE2);
        kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
        long j = Long.parseLong(strSubstring2);
        int i4 = iE2 + 1;
        String strSubstring3 = value.substring(i4, iE);
        kotlin.jvm.internal.j.f(strSubstring3, "substring(...)");
        long j6 = Long.parseLong(strSubstring3);
        if (z.w(value, 2, Global.HYPHEN, false)) {
            j6 = -j6;
        }
        int i6 = iE - i4;
        int i10 = i6;
        while (true) {
            if (i10 >= 9) {
                break;
            }
            j6 *= (long) 10;
            i10++;
        }
        for (i = 9; i < i6; i++) {
            j6 /= (long) 10;
        }
        Duration durationOfSeconds2 = Duration.ofSeconds(j, j6);
        kotlin.jvm.internal.j.f(durationOfSeconds2, "ofSeconds(...)");
        return durationOfSeconds2;
    }

    /* JADX INFO: renamed from: toStringOrNumber, reason: avoid collision after fix types in other method */
    public String toStringOrNumber2(Duration value) {
        String str;
        kotlin.jvm.internal.j.g(value, "value");
        long seconds = value.getSeconds();
        int nano = value.getNano();
        if (seconds < 0) {
            if (seconds == Long.MIN_VALUE) {
                str = "-922337203685477580";
                seconds = 8;
            } else {
                seconds = -seconds;
                str = Global.HYPHEN;
            }
            if (nano != 0) {
                seconds--;
                nano = Http2Connection.DEGRADED_PONG_TIMEOUT_NS - nano;
            }
        } else {
            str = "";
        }
        return nano == 0 ? String.format("%s%ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds)}, 2)) : nano % PlaybackException.CUSTOM_ERROR_CODE_BASE == 0 ? String.format("%s%d.%03ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(((long) nano) / 1000000)}, 3)) : nano % 1000 == 0 ? String.format("%s%d.%06ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(((long) nano) / 1000)}, 3)) : String.format("%s%d.%09ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano)}, 3));
    }
}
