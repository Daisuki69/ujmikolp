package com.dynatrace.android.agent.data;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionParameterUtil {
    public static final SessionParameterUtil INSTANCE = new SessionParameterUtil();
    private static final SecureRandom random = new SecureRandom();

    private SessionParameterUtil() {
    }

    public static final long generateVisitorId() {
        SecureRandom secureRandom = random;
        return ((long) (secureRandom.nextInt(65536) + (secureRandom.nextInt(65536) << 8))) + (((long) secureRandom.nextInt(65536)) << 16);
    }
}
