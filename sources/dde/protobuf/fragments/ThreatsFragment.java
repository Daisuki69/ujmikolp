package dde.protobuf.fragments;

import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import dg.b0;
import dg.c0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class ThreatsFragment extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "dde.protobuf.fragments.ExtractionDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ExtractionDetails extractionDetails;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> threats;
    public static final c0 Companion = new c0();
    public static final ProtoAdapter<ThreatsFragment> ADAPTER = new b0(FieldEncoding.LENGTH_DELIMITED, z.a(ThreatsFragment.class), "type.googleapis.com/dde.protobuf.fragments.ThreatsFragment", Syntax.PROTO_3, null, "dde-protobuf/fragments/ThreatsFragment.proto");

    public ThreatsFragment() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThreatsFragment copy$default(ThreatsFragment threatsFragment, ExtractionDetails extractionDetails, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            extractionDetails = threatsFragment.extractionDetails;
        }
        if ((i & 2) != 0) {
            list = threatsFragment.threats;
        }
        if ((i & 4) != 0) {
            byteString = threatsFragment.unknownFields();
        }
        return threatsFragment.copy(extractionDetails, list, byteString);
    }

    public final ThreatsFragment copy(ExtractionDetails extractionDetails, List<String> threats, ByteString unknownFields) {
        j.g(threats, "threats");
        j.g(unknownFields, "unknownFields");
        return new ThreatsFragment(extractionDetails, threats, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThreatsFragment)) {
            return false;
        }
        ThreatsFragment threatsFragment = (ThreatsFragment) obj;
        return j.b(unknownFields(), threatsFragment.unknownFields()) && j.b(this.extractionDetails, threatsFragment.extractionDetails) && j.b(this.threats, threatsFragment.threats);
    }

    public final ExtractionDetails getExtractionDetails() {
        return this.extractionDetails;
    }

    public final List<String> getThreats() {
        return this.threats;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ExtractionDetails extractionDetails = this.extractionDetails;
        int iHashCode2 = this.threats.hashCode() + ((iHashCode + (extractionDetails != null ? extractionDetails.hashCode() : 0)) * 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m252newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.extractionDetails != null) {
            arrayList.add("extractionDetails=" + this.extractionDetails);
        }
        if (!this.threats.isEmpty()) {
            arrayList.add("threats=" + Internal.sanitize(this.threats));
        }
        return C1110A.F(arrayList, ", ", "ThreatsFragment{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreatsFragment(ExtractionDetails extractionDetails, List<String> threats, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(threats, "threats");
        j.g(unknownFields, "unknownFields");
        this.extractionDetails = extractionDetails;
        this.threats = Internal.immutableCopyOf("threats", threats);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m252newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public ThreatsFragment(ExtractionDetails extractionDetails, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : extractionDetails, (i & 2) != 0 ? C1112C.f9377a : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }
}
