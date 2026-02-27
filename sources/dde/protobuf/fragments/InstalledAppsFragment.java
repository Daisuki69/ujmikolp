package dde.protobuf.fragments;

import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.AbstractC1414e;
import dg.C1371E;
import dg.C1372F;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class InstalledAppsFragment extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "dde.protobuf.fragments.Application#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<Application> applications;

    @WireField(adapter = "dde.protobuf.fragments.ExtractionDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ExtractionDetails extractionDetails;
    public static final C1372F Companion = new C1372F();
    public static final ProtoAdapter<InstalledAppsFragment> ADAPTER = new C1371E(FieldEncoding.LENGTH_DELIMITED, z.a(InstalledAppsFragment.class), "type.googleapis.com/dde.protobuf.fragments.InstalledAppsFragment", Syntax.PROTO_3, null, "dde-protobuf/fragments/InstalledAppsFragment.proto");

    public InstalledAppsFragment() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstalledAppsFragment copy$default(InstalledAppsFragment installedAppsFragment, ExtractionDetails extractionDetails, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            extractionDetails = installedAppsFragment.extractionDetails;
        }
        if ((i & 2) != 0) {
            list = installedAppsFragment.applications;
        }
        if ((i & 4) != 0) {
            byteString = installedAppsFragment.unknownFields();
        }
        return installedAppsFragment.copy(extractionDetails, list, byteString);
    }

    public final InstalledAppsFragment copy(ExtractionDetails extractionDetails, List<Application> applications, ByteString unknownFields) {
        j.g(applications, "applications");
        j.g(unknownFields, "unknownFields");
        return new InstalledAppsFragment(extractionDetails, applications, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstalledAppsFragment)) {
            return false;
        }
        InstalledAppsFragment installedAppsFragment = (InstalledAppsFragment) obj;
        return j.b(unknownFields(), installedAppsFragment.unknownFields()) && j.b(this.extractionDetails, installedAppsFragment.extractionDetails) && j.b(this.applications, installedAppsFragment.applications);
    }

    public final List<Application> getApplications() {
        return this.applications;
    }

    public final ExtractionDetails getExtractionDetails() {
        return this.extractionDetails;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ExtractionDetails extractionDetails = this.extractionDetails;
        int iHashCode2 = this.applications.hashCode() + ((iHashCode + (extractionDetails != null ? extractionDetails.hashCode() : 0)) * 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m241newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.extractionDetails != null) {
            arrayList.add("extractionDetails=" + this.extractionDetails);
        }
        if (!this.applications.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("applications="), this.applications, arrayList);
        }
        return C1110A.F(arrayList, ", ", "InstalledAppsFragment{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstalledAppsFragment(ExtractionDetails extractionDetails, List<Application> applications, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(applications, "applications");
        j.g(unknownFields, "unknownFields");
        this.extractionDetails = extractionDetails;
        this.applications = Internal.immutableCopyOf("applications", applications);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m241newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public InstalledAppsFragment(ExtractionDetails extractionDetails, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : extractionDetails, (i & 2) != 0 ? C1112C.f9377a : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }
}
