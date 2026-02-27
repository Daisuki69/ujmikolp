package Uj;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6009b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6010d;
    public final boolean e;
    public final a f;

    public d(boolean z4, String prettyPrintIndent, String classDiscriminator, boolean z5, boolean z8, a classDiscriminatorMode) {
        j.g(prettyPrintIndent, "prettyPrintIndent");
        j.g(classDiscriminator, "classDiscriminator");
        j.g(classDiscriminatorMode, "classDiscriminatorMode");
        this.f6008a = z4;
        this.f6009b = prettyPrintIndent;
        this.c = classDiscriminator;
        this.f6010d = z5;
        this.e = z8;
        this.f = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f6008a + ", prettyPrintIndent='" + this.f6009b + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.c + "', allowSpecialFloatingPointValues=" + this.f6010d + ", useAlternativeNames=" + this.e + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f + ')';
    }
}
