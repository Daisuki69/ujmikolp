package androidx.room.util;

import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.room.Room;
import cj.C1110A;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class StringUtil {
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static final void appendPlaceholders(StringBuilder builder, int i) {
        j.g(builder, "builder");
        for (int i4 = 0; i4 < i; i4++) {
            builder.append(Global.QUESTION);
            if (i4 < i - 1) {
                builder.append(",");
            }
        }
    }

    public static /* synthetic */ void getEMPTY_STRING_ARRAY$annotations() {
    }

    public static final String joinIntoString(List<Integer> list) {
        if (list != null) {
            return C1110A.F(list, ",", null, null, null, 62);
        }
        return null;
    }

    public static final StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    public static final List<Integer> splitToIntList(String str) {
        Integer numValueOf;
        if (str == null) {
            return null;
        }
        List listS = C2576A.S(str, new char[]{','});
        ArrayList arrayList = new ArrayList();
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) it.next()));
            } catch (NumberFormatException e) {
                Log.e(Room.LOG_TAG, "Malformed integer list", e);
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        return arrayList;
    }
}
