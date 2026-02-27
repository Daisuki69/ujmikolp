package d4;

import Ah.o;
import Ah.p;
import android.content.Context;
import android.util.TypedValue;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.common.C;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import cj.L;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.Path;
import pg.h;
import pg.i;
import pg.j;
import pg.t;
import s.AbstractC2217b;

/* JADX INFO: renamed from: d4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1331a {
    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return "FLOAT32";
            case 2:
                return "INT32";
            case 3:
                return "UINT8";
            case 4:
                return "INT64";
            case 5:
                return "STRING";
            case 6:
                return "BOOL";
            case 7:
                return "INT16";
            case 8:
                return "INT8";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int B(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("Name")) {
            return 1;
        }
        if (str.equals("Email")) {
            return 2;
        }
        if (str.equals("Education")) {
            return 3;
        }
        if (str.equals("Married")) {
            return 4;
        }
        if (str.equals("DOB")) {
            return 5;
        }
        if (str.equals("Gender")) {
            return 6;
        }
        if (str.equals("Phone")) {
            return 7;
        }
        if (str.equals("Age")) {
            return 8;
        }
        if (str.equals("FBID")) {
            return 9;
        }
        if (str.equals("GPID")) {
            return 10;
        }
        if (str.equals("Birthday")) {
            return 11;
        }
        throw new IllegalArgumentException("No enum constant com.clevertap.android.sdk.validation.Validator.RestrictedMultiValueFields.".concat(str));
    }

    public static boolean a(ok.b bVar, int i) {
        char c;
        if (i == 1) {
            c = '(';
        } else if (i == 2) {
            c = 30;
        } else if (i == 3) {
            c = 20;
        } else if (i == 4) {
            c = '\n';
        } else {
            if (i != 5) {
                throw null;
            }
            c = 0;
        }
        if (c == 0) {
            return bVar.d();
        }
        if (c == '\n') {
            return bVar.b();
        }
        if (c == 20) {
            return bVar.c();
        }
        if (c == 30) {
            return bVar.a();
        }
        if (c == '(') {
            return bVar.e();
        }
        StringBuilder sb2 = new StringBuilder("Level [");
        sb2.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TRACE" : "DEBUG" : "INFO" : "WARN" : "ERROR");
        sb2.append("] not recognized.");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static h b(j jVar) {
        return jVar.makeBackgroundTaskQueue(new i());
    }

    public static final int c(int i) {
        switch (AbstractC2217b.c(i)) {
            case 0:
            case 1:
                return 4;
            case 2:
            case 7:
                return 1;
            case 3:
                return 8;
            case 4:
            case 5:
                return -1;
            case 6:
                return 2;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + A(i) + " is not supported yet");
        }
    }

    public static boolean d(int i, int i4, int i6) {
        switch (i) {
            case 1:
                if (((i4 + i6) & 1) == 0) {
                }
                break;
            case 2:
                if ((i4 & 1) == 0) {
                }
                break;
            case 3:
                if (i6 % 3 == 0) {
                }
                break;
            case 4:
                if ((i4 + i6) % 3 == 0) {
                }
                break;
            case 5:
                if ((((i6 / 3) + (i4 / 2)) & 1) == 0) {
                }
                break;
            case 6:
                if ((i4 * i6) % 6 == 0) {
                }
                break;
            case 7:
                if ((i4 * i6) % 6 < 3) {
                }
                break;
            default:
                if (((((i4 * i6) % 3) + i4 + i6) & 1) == 0) {
                }
                break;
        }
        return true;
    }

    public static int e(Integer num) {
        int i;
        if (num == null) {
            return 0;
        }
        for (int i4 : AbstractC2217b.d(5)) {
            if (i4 == 1) {
                i = 414;
            } else if (i4 == 2) {
                i = TypedValues.CycleType.TYPE_ALPHA;
            } else if (i4 == 3) {
                i = YTAGReflectLiveCheckInterface.LightLiveCheckResult.INIT_ERROR;
            } else if (i4 == 4) {
                i = 9009;
            } else {
                if (i4 != 5) {
                    throw null;
                }
                i = 9010;
            }
            if (i == num.intValue()) {
                return i4;
            }
        }
        return 0;
    }

    public static boolean f(int i) {
        return i == 1 || i == 2 || i == 4;
    }

    public static /* synthetic */ int g(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int h(int i) {
        int i4 = 1;
        if (i != 1) {
            i4 = 2;
            if (i != 2) {
                i4 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i4;
    }

    public static /* synthetic */ int i(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 16;
            case 6:
                return 32;
            case 7:
                return 64;
            case 8:
                return 128;
            case 9:
                return 256;
            case 10:
                return 512;
            case 11:
                return 1024;
            case 12:
                return 2048;
            case 13:
                return 4096;
            case 14:
                return 8192;
            case 15:
                return 16384;
            case 16:
                return 32768;
            case 17:
                return 65536;
            case 18:
                return 131072;
            case 19:
                return 262144;
            case 20:
                return 524288;
            case 21:
                return 1048576;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case 25:
                return 16777216;
            case 26:
                return 33554432;
            case 27:
                return AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            case 28:
                return C.BUFFER_FLAG_FIRST_SAMPLE;
            default:
                throw null;
        }
    }

    public static float j(Context context, int i, float f) {
        return TypedValue.applyDimension(i, f, context.getResources().getDisplayMetrics());
    }

    public static int k(int i, int i4, int i6, int i10) {
        return ((i + i4) * i6) + i10;
    }

    public static Lh.h l(p pVar, p pVar2, o oVar) {
        pVar.getClass();
        return new Lh.h(pVar2, oVar, 0);
    }

    public static C1038i m(String str, String str2, String str3) {
        return AbstractC1039j.a(new AndroidWebKitError(str, str2, str3));
    }

    public static ClassCastException n(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String o(StringBuilder sb2, String str) {
        return str + ((Object) sb2);
    }

    public static String p(Path path, String str) {
        return str + path;
    }

    public static ArrayList q(int i, HashMap map, ArrayList arrayList, int i4, String str) {
        map.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i4);
        arrayList2.add(str);
        return arrayList2;
    }

    public static /* synthetic */ void r(int i, String str) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(kotlin.jvm.internal.j.j(str));
        kotlin.jvm.internal.j.k(nullPointerException, kotlin.jvm.internal.j.class.getName());
        throw nullPointerException;
    }

    public static void s(C1038i c1038i, Function1 function1) {
        function1.invoke(new C1037h(c1038i));
    }

    public static void t(String str, String str2, t tVar) {
        tVar.success(L.c(new Pair(str, str2)));
    }

    public static void u(Unit unit, Function1 function1) {
        function1.invoke(new C1037h(unit));
    }

    public static /* synthetic */ String v(int i) {
        if (i == 1) {
            return ShareTarget.METHOD_GET;
        }
        if (i == 2) {
            return ShareTarget.METHOD_POST;
        }
        throw null;
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "SPLITS_SYNC";
            case 2:
                return "MY_SEGMENTS_SYNC";
            case 3:
                return "EVENTS_RECORDER";
            case 4:
                return "IMPRESSIONS_RECORDER";
            case 5:
                return "LOAD_LOCAL_SPLITS";
            case 6:
                return "LOAD_LOCAL_MY_SEGMENTS";
            case 7:
                return "SSE_AUTHENTICATION_TASK";
            case 8:
                return "SPLIT_KILL";
            case 9:
                return "FILTER_SPLITS_CACHE";
            case 10:
                return "GENERIC_TASK";
            case 11:
                return "CLEAN_UP_DATABASE";
            case 12:
                return "IMPRESSIONS_COUNT_RECORDER";
            case 13:
                return "SAVE_IMPRESSIONS_COUNT";
            case 14:
                return "MY_SEGMENTS_UPDATE";
            case 15:
                return "LOAD_LOCAL_ATTRIBUTES";
            case 16:
                return "TELEMETRY_CONFIG_TASK";
            case 17:
                return "TELEMETRY_STATS_TASK";
            case 18:
                return "SAVE_UNIQUE_KEYS_TASK";
            case 19:
                return "UNIQUE_KEYS_RECORDER_TASK";
            case 20:
                return "MY_LARGE_SEGMENTS_UPDATE";
            case 21:
                return "LOAD_LOCAL_RULE_BASED_SEGMENTS";
            case 22:
                return "RULE_BASED_SEGMENT_SYNC";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNSPECIFIED" : "FROM_DEFAULT_COUNTRY" : "FROM_NUMBER_WITHOUT_PLUS_SIGN" : "FROM_NUMBER_WITH_IDD" : "FROM_NUMBER_WITH_PLUS_SIGN";
    }

    public static /* synthetic */ String z(int i) {
        switch (i) {
            case 1:
                return "SPLITS_SYNC";
            case 2:
                return "MY_SEGMENTS_SYNC";
            case 3:
                return "EVENTS_RECORDER";
            case 4:
                return "IMPRESSIONS_RECORDER";
            case 5:
                return "LOAD_LOCAL_SPLITS";
            case 6:
                return "LOAD_LOCAL_MY_SEGMENTS";
            case 7:
                return "SSE_AUTHENTICATION_TASK";
            case 8:
                return "SPLIT_KILL";
            case 9:
                return "FILTER_SPLITS_CACHE";
            case 10:
                return "GENERIC_TASK";
            case 11:
                return "CLEAN_UP_DATABASE";
            case 12:
                return "IMPRESSIONS_COUNT_RECORDER";
            case 13:
                return "SAVE_IMPRESSIONS_COUNT";
            case 14:
                return "MY_SEGMENTS_UPDATE";
            case 15:
                return "LOAD_LOCAL_ATTRIBUTES";
            case 16:
                return "TELEMETRY_CONFIG_TASK";
            case 17:
                return "TELEMETRY_STATS_TASK";
            case 18:
                return "SAVE_UNIQUE_KEYS_TASK";
            case 19:
                return "UNIQUE_KEYS_RECORDER_TASK";
            case 20:
                return "MY_LARGE_SEGMENTS_UPDATE";
            case 21:
                return "LOAD_LOCAL_RULE_BASED_SEGMENTS";
            case 22:
                return "RULE_BASED_SEGMENT_SYNC";
            default:
                return "null";
        }
    }
}
