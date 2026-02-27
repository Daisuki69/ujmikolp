package Ti;

import io.split.android.client.dtos.MatcherType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5852a;

    static {
        int[] iArr = new int[MatcherType.values().length];
        f5852a = iArr;
        try {
            iArr[MatcherType.ALL_KEYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5852a[MatcherType.IN_SEGMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5852a[MatcherType.IN_LARGE_SEGMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f5852a[MatcherType.WHITELIST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f5852a[MatcherType.EQUAL_TO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f5852a[MatcherType.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f5852a[MatcherType.LESS_THAN_OR_EQUAL_TO.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f5852a[MatcherType.BETWEEN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f5852a[MatcherType.EQUAL_TO_SET.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f5852a[MatcherType.PART_OF_SET.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f5852a[MatcherType.CONTAINS_ALL_OF_SET.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f5852a[MatcherType.CONTAINS_ANY_OF_SET.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f5852a[MatcherType.STARTS_WITH.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f5852a[MatcherType.ENDS_WITH.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f5852a[MatcherType.CONTAINS_STRING.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f5852a[MatcherType.MATCHES_STRING.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f5852a[MatcherType.IN_SPLIT_TREATMENT.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            f5852a[MatcherType.EQUAL_TO_BOOLEAN.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            f5852a[MatcherType.EQUAL_TO_SEMVER.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            f5852a[MatcherType.GREATER_THAN_OR_EQUAL_TO_SEMVER.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            f5852a[MatcherType.LESS_THAN_OR_EQUAL_TO_SEMVER.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            f5852a[MatcherType.BETWEEN_SEMVER.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            f5852a[MatcherType.IN_LIST_SEMVER.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            f5852a[MatcherType.IN_RULE_BASED_SEGMENT.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
    }
}
