package e3;

import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f16580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f16581b;

    public m(t localOverrideSettings, t remoteSettings) {
        kotlin.jvm.internal.j.g(localOverrideSettings, "localOverrideSettings");
        kotlin.jvm.internal.j.g(remoteSettings, "remoteSettings");
        this.f16580a = localOverrideSettings;
        this.f16581b = remoteSettings;
    }

    public final double a() {
        Double dC = this.f16580a.c();
        if (dC != null) {
            double dDoubleValue = dC.doubleValue();
            if (AudioStats.AUDIO_AMPLITUDE_NONE <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double dC2 = this.f16581b.c();
        if (dC2 != null) {
            double dDoubleValue2 = dC2.doubleValue();
            if (AudioStats.AUDIO_AMPLITUDE_NONE <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r6.d(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ij.AbstractC1609c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof e3.l
            if (r0 == 0) goto L13
            r0 = r6
            e3.l r0 = (e3.l) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            e3.l r0 = new e3.l
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f16579b
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            bj.AbstractC1039j.b(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            e3.m r2 = r0.f16578a
            bj.AbstractC1039j.b(r6)
            goto L49
        L38:
            bj.AbstractC1039j.b(r6)
            r0.f16578a = r5
            r0.e = r4
            e3.t r6 = r5.f16580a
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L48
            goto L56
        L48:
            r2 = r5
        L49:
            e3.t r6 = r2.f16581b
            r2 = 0
            r0.f16578a = r2
            r0.e = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            kotlin.Unit r6 = kotlin.Unit.f18162a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.m.b(ij.c):java.lang.Object");
    }
}
