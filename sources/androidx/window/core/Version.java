package androidx.window.core;

import We.s;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.dynatrace.android.agent.Global;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public final class Version implements Comparable<Version> {
    private static final Version CURRENT;
    public static final Companion Companion = new Companion(null);
    private static final Version UNKNOWN = new Version(0, 0, 0, "");
    private static final Version VERSION_0_1 = new Version(0, 1, 0, "");
    private static final Version VERSION_1_0;
    private static final String VERSION_PATTERN_STRING = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";
    private final InterfaceC1033d bigInteger$delegate;
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Version getCURRENT() {
            return Version.CURRENT;
        }

        public final Version getUNKNOWN() {
            return Version.UNKNOWN;
        }

        public final Version getVERSION_0_1() {
            return Version.VERSION_0_1;
        }

        public final Version getVERSION_1_0() {
            return Version.VERSION_1_0;
        }

        public final Version parse(String str) {
            String strGroup;
            if (str != null && !C2576A.H(str)) {
                Matcher matcher = Pattern.compile(Version.VERSION_PATTERN_STRING).matcher(str);
                if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
                    int i = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    if (strGroup2 != null) {
                        int i4 = Integer.parseInt(strGroup2);
                        String strGroup3 = matcher.group(3);
                        if (strGroup3 != null) {
                            int i6 = Integer.parseInt(strGroup3);
                            String description = matcher.group(4) != null ? matcher.group(4) : "";
                            j.f(description, "description");
                            return new Version(i, i4, i6, description, null);
                        }
                    }
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    static {
        Version version = new Version(1, 0, 0, "");
        VERSION_1_0 = version;
        CURRENT = version;
    }

    public /* synthetic */ Version(int i, int i4, int i6, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i4, i6, str);
    }

    private final BigInteger getBigInteger() {
        Object value = this.bigInteger$delegate.getValue();
        j.f(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public static final Version parse(String str) {
        return Companion.parse(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return ((((527 + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    public String toString() {
        String str;
        if (C2576A.H(this.description)) {
            str = "";
        } else {
            str = Global.HYPHEN + this.description;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append('.');
        sb2.append(this.minor);
        sb2.append('.');
        return s.o(sb2, str, this.patch);
    }

    private Version(int i, int i4, int i6, String str) {
        this.major = i;
        this.minor = i4;
        this.patch = i6;
        this.description = str;
        this.bigInteger$delegate = C1034e.b(new Version$bigInteger$2(this));
    }

    @Override // java.lang.Comparable
    public int compareTo(Version other) {
        j.g(other, "other");
        return getBigInteger().compareTo(other.getBigInteger());
    }
}
