package androidx.media3.common.util;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import k2.v0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class UriUtil {
    private static final int FRAGMENT = 3;
    private static final int INDEX_COUNT = 4;
    private static final int PATH = 1;
    private static final int QUERY = 2;
    private static final int SCHEME_COLON = 0;

    private UriUtil() {
    }

    @UnstableApi
    public static String getRelativePath(Uri uri, Uri uri2) {
        if (uri.isOpaque() || uri2.isOpaque()) {
            return uri2.toString();
        }
        String scheme = uri.getScheme();
        String scheme2 = uri2.getScheme();
        if (scheme != null ? !(scheme2 == null || !v0.i(scheme, scheme2)) : scheme2 == null) {
            if (Util.areEqual(uri.getAuthority(), uri2.getAuthority())) {
                List<String> pathSegments = uri.getPathSegments();
                List<String> pathSegments2 = uri2.getPathSegments();
                int iMin = Math.min(pathSegments.size(), pathSegments2.size());
                int i = 0;
                for (int i4 = 0; i4 < iMin && pathSegments.get(i4).equals(pathSegments2.get(i4)); i4++) {
                    i++;
                }
                StringBuilder sb2 = new StringBuilder();
                for (int i6 = i; i6 < pathSegments.size(); i6++) {
                    sb2.append("../");
                }
                while (i < pathSegments2.size()) {
                    sb2.append(pathSegments2.get(i));
                    if (i < pathSegments2.size() - 1) {
                        sb2.append("/");
                    }
                    i++;
                }
                return sb2.toString();
            }
        }
        return uri2.toString();
    }

    private static int[] getUriIndices(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static boolean isAbsolute(@Nullable String str) {
        return (str == null || getUriIndices(str)[0] == -1) ? false : true;
    }

    private static String removeDotSegments(StringBuilder sb2, int i, int i4) {
        int i6;
        int iLastIndexOf;
        if (i >= i4) {
            return sb2.toString();
        }
        if (sb2.charAt(i) == '/') {
            i++;
        }
        int i10 = i;
        int i11 = i10;
        while (i10 <= i4) {
            if (i10 == i4) {
                i6 = i10;
            } else if (sb2.charAt(i10) == '/') {
                i6 = i10 + 1;
            } else {
                i10++;
            }
            int i12 = i11 + 1;
            if (i10 == i12 && sb2.charAt(i11) == '.') {
                sb2.delete(i11, i6);
                i4 -= i6 - i11;
            } else {
                if (i10 == i11 + 2 && sb2.charAt(i11) == '.' && sb2.charAt(i12) == '.') {
                    iLastIndexOf = sb2.lastIndexOf("/", i11 - 2) + 1;
                    int i13 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb2.delete(i13, i6);
                    i4 -= i6 - i13;
                } else {
                    iLastIndexOf = i10 + 1;
                }
                i11 = iLastIndexOf;
            }
            i10 = i11;
        }
        return sb2.toString();
    }

    public static Uri removeQueryParameter(Uri uri, String str) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                Iterator<String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static String resolve(@Nullable String str, @Nullable String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] uriIndices = getUriIndices(str2);
        if (uriIndices[0] != -1) {
            sb2.append(str2);
            removeDotSegments(sb2, uriIndices[1], uriIndices[2]);
            return sb2.toString();
        }
        int[] uriIndices2 = getUriIndices(str);
        if (uriIndices[3] == 0) {
            sb2.append((CharSequence) str, 0, uriIndices2[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (uriIndices[2] == 0) {
            sb2.append((CharSequence) str, 0, uriIndices2[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i = uriIndices[1];
        if (i != 0) {
            int i4 = uriIndices2[0] + 1;
            sb2.append((CharSequence) str, 0, i4);
            sb2.append(str2);
            return removeDotSegments(sb2, uriIndices[1] + i4, i4 + uriIndices[2]);
        }
        if (str2.charAt(i) == '/') {
            sb2.append((CharSequence) str, 0, uriIndices2[1]);
            sb2.append(str2);
            int i6 = uriIndices2[1];
            return removeDotSegments(sb2, i6, uriIndices[2] + i6);
        }
        int i10 = uriIndices2[0] + 2;
        int i11 = uriIndices2[1];
        if (i10 >= i11 || i11 != uriIndices2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, uriIndices2[2] - 1);
            int i12 = iLastIndexOf == -1 ? uriIndices2[1] : iLastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i12);
            sb2.append(str2);
            return removeDotSegments(sb2, uriIndices2[1], i12 + uriIndices[2]);
        }
        sb2.append((CharSequence) str, 0, i11);
        sb2.append('/');
        sb2.append(str2);
        int i13 = uriIndices2[1];
        return removeDotSegments(sb2, i13, uriIndices[2] + i13 + 1);
    }

    public static Uri resolveToUri(@Nullable String str, @Nullable String str2) {
        return Uri.parse(resolve(str, str2));
    }
}
