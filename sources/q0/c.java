package q0;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f19735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f19736b;
    public static final d c;

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    static {
        /*
            java.lang.String r0 = "com.google.android.exoplayer2.ExoPlayer"
            java.lang.String r1 = "com.google.android.exoplayer2.source.hls.HlsMediaSource"
            java.lang.String r2 = "com.google.android.exoplayer2.ui.StyledPlayerView"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            java.util.List r0 = cj.C1132s.g(r0)
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = " is missing!!!"
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L26
            goto L12
        L26:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            D.S.b(r0)
            java.lang.String r0 = "One or more ExoPlayer library files are missing!!!"
            D.S.b(r0)
            r0 = r4
            goto L45
        L3f:
            java.lang.String r0 = "ExoPlayer is present"
            D.S.b(r0)
            r0 = r3
        L45:
            q0.c.f19735a = r0
            java.lang.String r0 = "androidx.media3.exoplayer.ExoPlayer"
            java.lang.String r1 = "androidx.media3.exoplayer.hls.HlsMediaSource"
            java.lang.String r5 = "androidx.media3.ui.PlayerView"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r5}
            java.util.List r0 = cj.C1132s.g(r0)
            java.util.Iterator r0 = r0.iterator()
        L59:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L82
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L69
            goto L59
        L69:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            D.S.b(r0)
            java.lang.String r0 = "One or more Media3 library files are missing!!!"
            D.S.b(r0)
            r0 = r4
            goto L88
        L82:
            java.lang.String r0 = "Media3 is present"
            D.S.b(r0)
            r0 = r3
        L88:
            boolean r1 = q0.c.f19735a
            if (r0 != 0) goto L93
            if (r1 != 0) goto L93
            java.lang.String r2 = "Please add ExoPlayer/Media3 dependencies to render InApp or Inbox messages playing video. For more information checkout CleverTap documentation."
            D.S.b(r2)
        L93:
            if (r1 != 0) goto L99
            if (r0 == 0) goto L98
            goto L99
        L98:
            r3 = r4
        L99:
            q0.c.f19736b = r3
            if (r0 == 0) goto La0
            q0.d r0 = q0.d.f19738b
            goto La7
        La0:
            if (r1 == 0) goto La5
            q0.d r0 = q0.d.f19737a
            goto La7
        La5:
            q0.d r0 = q0.d.c
        La7:
            q0.c.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.c.<clinit>():void");
    }
}
