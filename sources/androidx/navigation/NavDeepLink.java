package androidx.navigation;

import We.s;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1110A;
import cj.C1112C;
import cj.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import zj.C2576A;
import zj.o;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class NavDeepLink {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final Pattern SCHEME_PATTERN = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    private final String action;
    private final List<String> arguments;
    private boolean isExactDeepLink;
    private boolean isParameterizedQuery;
    private boolean isSingleQueryParamValueOnly;
    private final String mimeType;
    private String mimeTypeFinalRegex;
    private final InterfaceC1033d mimeTypePattern$delegate;
    private final Map<String, ParamQuery> paramArgMap;
    private final InterfaceC1033d pattern$delegate;
    private String patternFinalRegex;
    private final String uriPattern;

    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        private String action;
        private String mimeType;
        private String uriPattern;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Builder fromAction(String action) {
                j.g(action, "action");
                if (action.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                }
                Builder builder = new Builder();
                builder.setAction(action);
                return builder;
            }

            public final Builder fromMimeType(String mimeType) {
                j.g(mimeType, "mimeType");
                Builder builder = new Builder();
                builder.setMimeType(mimeType);
                return builder;
            }

            public final Builder fromUriPattern(String uriPattern) {
                j.g(uriPattern, "uriPattern");
                Builder builder = new Builder();
                builder.setUriPattern(uriPattern);
                return builder;
            }

            private Companion() {
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder() {
        }

        public static final Builder fromAction(String str) {
            return Companion.fromAction(str);
        }

        public static final Builder fromMimeType(String str) {
            return Companion.fromMimeType(str);
        }

        public static final Builder fromUriPattern(String str) {
            return Companion.fromUriPattern(str);
        }

        public final NavDeepLink build() {
            return new NavDeepLink(this.uriPattern, this.action, this.mimeType);
        }

        public final Builder setAction(String action) {
            j.g(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.action = action;
            return this;
        }

        public final Builder setMimeType(String mimeType) {
            j.g(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }

        public final Builder setUriPattern(String uriPattern) {
            j.g(uriPattern, "uriPattern");
            this.uriPattern = uriPattern;
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class MimeType implements Comparable<MimeType> {
        private String subType;
        private String type;

        public MimeType(String mimeType) {
            List listR;
            j.g(mimeType, "mimeType");
            List listI = new o("/").i(0, mimeType);
            if (listI.isEmpty()) {
                listR = C1112C.f9377a;
            } else {
                ListIterator listIterator = listI.listIterator(listI.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listR = C1110A.R(listI, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listR = C1112C.f9377a;
            }
            this.type = (String) listR.get(0);
            this.subType = (String) listR.get(1);
        }

        public final String getSubType() {
            return this.subType;
        }

        public final String getType() {
            return this.type;
        }

        public final void setSubType(String str) {
            j.g(str, "<set-?>");
            this.subType = str;
        }

        public final void setType(String str) {
            j.g(str, "<set-?>");
            this.type = str;
        }

        @Override // java.lang.Comparable
        public int compareTo(MimeType other) {
            j.g(other, "other");
            int i = j.b(this.type, other.type) ? 2 : 0;
            return j.b(this.subType, other.subType) ? i + 1 : i;
        }
    }

    public static final class ParamQuery {
        private final List<String> arguments = new ArrayList();
        private String paramRegex;

        public final void addArgumentName(String name) {
            j.g(name, "name");
            this.arguments.add(name);
        }

        public final String getArgumentName(int i) {
            return this.arguments.get(i);
        }

        public final List<String> getArguments() {
            return this.arguments;
        }

        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void setParamRegex(String str) {
            this.paramRegex = str;
        }

        public final int size() {
            return this.arguments.size();
        }
    }

    public NavDeepLink(String str, String str2, String str3) {
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        this.arguments = new ArrayList();
        this.paramArgMap = new LinkedHashMap();
        this.pattern$delegate = C1034e.b(new NavDeepLink$pattern$2(this));
        this.mimeTypePattern$delegate = C1034e.b(new NavDeepLink$mimeTypePattern$2(this));
        if (str != null) {
            Uri uri = Uri.parse(str);
            int i = 0;
            this.isParameterizedQuery = uri.getQuery() != null;
            StringBuilder sb2 = new StringBuilder("^");
            if (!SCHEME_PATTERN.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Pattern fillInPattern = Pattern.compile("\\{(.+?)\\}");
            if (this.isParameterizedQuery) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String strSubstring = str.substring(0, matcher.start());
                    j.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    j.f(fillInPattern, "fillInPattern");
                    this.isExactDeepLink = buildPathRegex(strSubstring, sb2, fillInPattern);
                }
                for (String paramName : uri.getQueryParameterNames()) {
                    StringBuilder sb3 = new StringBuilder();
                    String queryParam = uri.getQueryParameter(paramName);
                    if (queryParam == null) {
                        this.isSingleQueryParamValueOnly = true;
                        queryParam = paramName;
                    }
                    Matcher matcher2 = fillInPattern.matcher(queryParam);
                    ParamQuery paramQuery = new ParamQuery();
                    int iEnd = i;
                    while (matcher2.find()) {
                        String strGroup = matcher2.group(1);
                        if (strGroup == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        paramQuery.addArgumentName(strGroup);
                        j.f(queryParam, "queryParam");
                        String strSubstring2 = queryParam.substring(iEnd, matcher2.start());
                        j.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(Pattern.quote(strSubstring2));
                        sb3.append("(.+?)?");
                        iEnd = matcher2.end();
                    }
                    if (iEnd < queryParam.length()) {
                        String strSubstring3 = queryParam.substring(iEnd);
                        j.f(strSubstring3, "this as java.lang.String).substring(startIndex)");
                        sb3.append(Pattern.quote(strSubstring3));
                    }
                    String string = sb3.toString();
                    j.f(string, "argRegex.toString()");
                    paramQuery.setParamRegex(z.t(string, ".*", "\\E.*\\Q"));
                    Map<String, ParamQuery> map = this.paramArgMap;
                    j.f(paramName, "paramName");
                    map.put(paramName, paramQuery);
                    i = 0;
                }
            } else {
                j.f(fillInPattern, "fillInPattern");
                this.isExactDeepLink = buildPathRegex(str, sb2, fillInPattern);
            }
            String string2 = sb2.toString();
            j.f(string2, "uriRegex.toString()");
            this.patternFinalRegex = z.t(string2, ".*", "\\E.*\\Q");
        }
        if (this.mimeType != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.mimeType).matches()) {
                throw new IllegalArgumentException(s.p(new StringBuilder("The given mimeType "), this.mimeType, " does not match to required \"type/subtype\" format").toString());
            }
            MimeType mimeType = new MimeType(this.mimeType);
            this.mimeTypeFinalRegex = z.t("^(" + mimeType.getType() + "|[*]+)/(" + mimeType.getSubType() + "|[*]+)$", "*|[*]", "[\\s\\S]");
        }
    }

    private final boolean buildPathRegex(String str, StringBuilder sb2, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z4 = !C2576A.z(str, ".*", false, 2);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.arguments.add(strGroup);
            String strSubstring = str.substring(iEnd, matcher.start());
            j.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(Pattern.quote(strSubstring));
            sb2.append("([^/]+?)");
            iEnd = matcher.end();
            z4 = false;
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            j.f(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(Pattern.quote(strSubstring2));
        }
        sb2.append("($|(\\?(.)*)|(\\#(.)*))");
        return z4;
    }

    private final Pattern getMimeTypePattern() {
        return (Pattern) this.mimeTypePattern$delegate.getValue();
    }

    private final Pattern getPattern() {
        return (Pattern) this.pattern$delegate.getValue();
    }

    private final boolean matchAction(String str) {
        boolean z4 = str == null;
        String str2 = this.action;
        if (z4 == (str2 != null)) {
            return false;
        }
        return str == null || j.b(str2, str);
    }

    private final boolean matchMimeType(String str) {
        if ((str == null) == (this.mimeType != null)) {
            return false;
        }
        if (str != null) {
            Pattern mimeTypePattern = getMimeTypePattern();
            j.d(mimeTypePattern);
            if (!mimeTypePattern.matcher(str).matches()) {
                return false;
            }
        }
        return true;
    }

    private final boolean matchUri(Uri uri) {
        if ((uri == null) == (getPattern() != null)) {
            return false;
        }
        if (uri != null) {
            Pattern pattern = getPattern();
            j.d(pattern);
            if (!pattern.matcher(uri.toString()).matches()) {
                return false;
            }
        }
        return true;
    }

    private final boolean parseArgument(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (navArgument != null) {
            navArgument.getType().parseAndPut(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof NavDeepLink)) {
            NavDeepLink navDeepLink = (NavDeepLink) obj;
            if (j.b(this.uriPattern, navDeepLink.uriPattern) && j.b(this.action, navDeepLink.action) && j.b(this.mimeType, navDeepLink.mimeType)) {
                return true;
            }
        }
        return false;
    }

    public final String getAction() {
        return this.action;
    }

    public final List<String> getArgumentsNames$navigation_common_release() {
        List<String> list = this.arguments;
        Collection<ParamQuery> collectionValues = this.paramArgMap.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            x.p(((ParamQuery) it.next()).getArguments(), arrayList);
        }
        return C1110A.L(arrayList, list);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Bundle getMatchingArguments(Uri deepLink, Map<String, NavArgument> arguments) {
        Matcher matcher;
        String strGroup;
        String strSubstring;
        j.g(deepLink, "deepLink");
        j.g(arguments, "arguments");
        Pattern pattern = getPattern();
        Matcher matcher2 = pattern != null ? pattern.matcher(deepLink.toString()) : null;
        if (matcher2 != null && matcher2.matches()) {
            Bundle bundle = new Bundle();
            int size = this.arguments.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    if (this.isParameterizedQuery) {
                        for (String str : this.paramArgMap.keySet()) {
                            ParamQuery paramQuery = this.paramArgMap.get(str);
                            String queryParameter = deepLink.getQueryParameter(str);
                            if (this.isSingleQueryParamValueOnly) {
                                String string = deepLink.toString();
                                j.f(string, "deepLink.toString()");
                                int iE = C2576A.E(string, '?', 0, 6);
                                if (iE == -1) {
                                    strSubstring = string;
                                } else {
                                    strSubstring = string.substring(iE + 1, string.length());
                                    j.f(strSubstring, "substring(...)");
                                }
                                if (!strSubstring.equals(string)) {
                                    queryParameter = strSubstring;
                                }
                            }
                            if (queryParameter != null) {
                                j.d(paramQuery);
                                matcher = Pattern.compile(paramQuery.getParamRegex(), 32).matcher(queryParameter);
                                if (!matcher.matches()) {
                                }
                            } else {
                                matcher = null;
                            }
                            Bundle bundle2 = new Bundle();
                            try {
                                j.d(paramQuery);
                                int size2 = paramQuery.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    if (matcher != null) {
                                        strGroup = matcher.group(i4 + 1);
                                        if (strGroup == null) {
                                            strGroup = "";
                                        }
                                    } else {
                                        strGroup = null;
                                    }
                                    String argumentName = paramQuery.getArgumentName(i4);
                                    NavArgument navArgument = arguments.get(argumentName);
                                    if (strGroup != null) {
                                        StringBuilder sb2 = new StringBuilder();
                                        try {
                                            sb2.append('{');
                                            sb2.append(argumentName);
                                            sb2.append('}');
                                            if (!strGroup.equals(sb2.toString()) && parseArgument(bundle2, argumentName, strGroup, navArgument)) {
                                                return null;
                                            }
                                        } catch (IllegalArgumentException unused) {
                                            continue;
                                        }
                                    }
                                }
                                bundle.putAll(bundle2);
                            } catch (IllegalArgumentException unused2) {
                            }
                        }
                    }
                    for (Map.Entry<String, NavArgument> entry : arguments.entrySet()) {
                        String key = entry.getKey();
                        NavArgument value = entry.getValue();
                        if (value != null && !value.isNullable() && !value.isDefaultValuePresent() && !bundle.containsKey(key)) {
                            return null;
                        }
                    }
                    return bundle;
                }
                String str2 = this.arguments.get(i);
                i++;
                String value2 = Uri.decode(matcher2.group(i));
                NavArgument navArgument2 = arguments.get(str2);
                try {
                    j.f(value2, "value");
                    if (parseArgument(bundle, str2, value2, navArgument2)) {
                        break;
                    }
                } catch (IllegalArgumentException unused3) {
                }
            }
        }
        return null;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMimeTypeMatchRating(String mimeType) {
        j.g(mimeType, "mimeType");
        if (this.mimeType == null) {
            return -1;
        }
        Pattern mimeTypePattern = getMimeTypePattern();
        j.d(mimeTypePattern);
        if (mimeTypePattern.matcher(mimeType).matches()) {
            return new MimeType(this.mimeType).compareTo(new MimeType(mimeType));
        }
        return -1;
    }

    public final String getUriPattern() {
        return this.uriPattern;
    }

    public int hashCode() {
        String str = this.uriPattern;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mimeType;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isExactDeepLink() {
        return this.isExactDeepLink;
    }

    public final boolean matches$navigation_common_release(Uri uri) {
        j.g(uri, "uri");
        return matches$navigation_common_release(new NavDeepLinkRequest(uri, null, null));
    }

    public final void setExactDeepLink$navigation_common_release(boolean z4) {
        this.isExactDeepLink = z4;
    }

    public final boolean matches$navigation_common_release(NavDeepLinkRequest deepLinkRequest) {
        j.g(deepLinkRequest, "deepLinkRequest");
        if (matchUri(deepLinkRequest.getUri()) && matchAction(deepLinkRequest.getAction())) {
            return matchMimeType(deepLinkRequest.getMimeType());
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLink(String uri) {
        this(uri, null, null);
        j.g(uri, "uri");
    }
}
