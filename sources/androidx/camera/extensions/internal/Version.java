package androidx.camera.extensions.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dynatrace.android.agent.Global;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class Version implements Comparable<Version> {
    public static final Version VERSION_1_0 = create(1, 0, 0, "");
    public static final Version VERSION_1_1 = create(1, 1, 0, "");
    public static final Version VERSION_1_2 = create(1, 2, 0, "");
    public static final Version VERSION_1_3 = create(1, 3, 0, "");
    public static final Version VERSION_1_4 = create(1, 4, 0, "");
    private static final Pattern VERSION_STRING_PATTERN = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    @NonNull
    public static Version create(int i, int i4, int i6, @NonNull String str) {
        return new AutoValue_Version(i, i4, i6, str);
    }

    private static BigInteger createBigInteger(Version version) {
        return BigInteger.valueOf(version.getMajor()).shiftLeft(32).or(BigInteger.valueOf(version.getMinor())).shiftLeft(32).or(BigInteger.valueOf(version.getPatch()));
    }

    @Nullable
    public static Version parse(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = VERSION_STRING_PATTERN.matcher(str);
        if (matcher.matches()) {
            return create(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        return Integer.valueOf(getMajor()).equals(Integer.valueOf(version.getMajor())) && Integer.valueOf(getMinor()).equals(Integer.valueOf(version.getMinor())) && Integer.valueOf(getPatch()).equals(Integer.valueOf(version.getPatch()));
    }

    public abstract String getDescription();

    public abstract int getMajor();

    public abstract int getMinor();

    public abstract int getPatch();

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(getMajor()), Integer.valueOf(getMinor()), Integer.valueOf(getPatch()));
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(getMajor() + "." + getMinor() + "." + getPatch());
        if (!TextUtils.isEmpty(getDescription())) {
            sb2.append(Global.HYPHEN + getDescription());
        }
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Version version) {
        return createBigInteger(this).compareTo(createBigInteger(version));
    }

    public int compareTo(int i) {
        return compareTo(i, 0);
    }

    public int compareTo(int i, int i4) {
        if (getMajor() == i) {
            return Integer.compare(getMinor(), i4);
        }
        return Integer.compare(getMajor(), i);
    }
}
