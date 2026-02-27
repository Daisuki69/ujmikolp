package androidx.media3.common.util;

import We.s;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;

    @GuardedBy("lock")
    private static int logLevel = 0;

    @GuardedBy("lock")
    private static boolean logStackTraces = true;
    private static final Object lock = new Object();

    @GuardedBy("lock")
    private static Logger logger = Logger.DEFAULT;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public interface Logger {
        public static final Logger DEFAULT = new Logger() { // from class: androidx.media3.common.util.Log.Logger.1
            @Override // androidx.media3.common.util.Log.Logger
            public void d(String str, String str2, @Nullable Throwable th2) {
                android.util.Log.d(str, Log.appendThrowableString(str2, th2));
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void e(String str, String str2, @Nullable Throwable th2) {
                android.util.Log.e(str, Log.appendThrowableString(str2, th2));
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void i(String str, String str2, @Nullable Throwable th2) {
                android.util.Log.i(str, Log.appendThrowableString(str2, th2));
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void w(String str, String str2, @Nullable Throwable th2) {
                android.util.Log.w(str, Log.appendThrowableString(str2, th2));
            }
        };

        void d(String str, String str2, @Nullable Throwable th2);

        void e(String str, String str2, @Nullable Throwable th2);

        void i(String str, String str2, @Nullable Throwable th2);

        void w(String str, String str2, @Nullable Throwable th2);
    }

    private Log() {
    }

    public static String appendThrowableString(String str, @Nullable Throwable th2) {
        String throwableString = getThrowableString(th2);
        if (TextUtils.isEmpty(throwableString)) {
            return str;
        }
        StringBuilder sbV = s.v(str, "\n  ");
        sbV.append(throwableString.replace(Global.NEWLINE, "\n  "));
        sbV.append('\n');
        return sbV.toString();
    }

    public static void d(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel == 0) {
                    logger.d(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void e(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 3) {
                    logger.e(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int getLogLevel() {
        int i;
        synchronized (lock) {
            i = logLevel;
        }
        return i;
    }

    @Nullable
    public static String getThrowableString(@Nullable Throwable th2) {
        if (th2 == null) {
            return null;
        }
        synchronized (lock) {
            try {
                if (isCausedByUnknownHostException(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (logStackTraces) {
                    return android.util.Log.getStackTraceString(th2).trim().replace("\t", "    ");
                }
                return th2.getMessage();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void i(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 1) {
                    logger.i(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean isCausedByUnknownHostException(@Nullable Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void setLogLevel(int i) {
        synchronized (lock) {
            logLevel = i;
        }
    }

    public static void setLogStackTraces(boolean z4) {
        synchronized (lock) {
            logStackTraces = z4;
        }
    }

    public static void setLogger(Logger logger2) {
        synchronized (lock) {
            logger = logger2;
        }
    }

    public static void w(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 2) {
                    logger.w(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (lock) {
            try {
                if (logLevel == 0) {
                    logger.d(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void e(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (lock) {
            try {
                if (logLevel <= 3) {
                    logger.e(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void i(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (lock) {
            try {
                if (logLevel <= 1) {
                    logger.i(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void w(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (lock) {
            try {
                if (logLevel <= 2) {
                    logger.w(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
