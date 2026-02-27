package dde.protobuf.fragments;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.AbstractC1414e;
import dg.C1396u;
import dg.C1397v;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class ExtractionDetails extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final long duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String extractionEnd;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String extractionStart;
    public static final C1397v Companion = new C1397v();
    public static final ProtoAdapter<ExtractionDetails> ADAPTER = new C1396u(FieldEncoding.LENGTH_DELIMITED, z.a(ExtractionDetails.class), "type.googleapis.com/dde.protobuf.fragments.ExtractionDetails", Syntax.PROTO_3, null, "dde-protobuf/fragments/ExtractionDetails.proto");

    public ExtractionDetails() {
        this(null, null, 0L, null, 15, null);
    }

    public static /* synthetic */ ExtractionDetails copy$default(ExtractionDetails extractionDetails, String str, String str2, long j, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extractionDetails.extractionStart;
        }
        if ((i & 2) != 0) {
            str2 = extractionDetails.extractionEnd;
        }
        if ((i & 4) != 0) {
            j = extractionDetails.duration;
        }
        if ((i & 8) != 0) {
            byteString = extractionDetails.unknownFields();
        }
        ByteString byteString2 = byteString;
        return extractionDetails.copy(str, str2, j, byteString2);
    }

    public final ExtractionDetails copy(String extractionStart, String extractionEnd, long j, ByteString unknownFields) {
        j.g(extractionStart, "extractionStart");
        j.g(extractionEnd, "extractionEnd");
        j.g(unknownFields, "unknownFields");
        return new ExtractionDetails(extractionStart, extractionEnd, j, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtractionDetails)) {
            return false;
        }
        ExtractionDetails extractionDetails = (ExtractionDetails) obj;
        return j.b(unknownFields(), extractionDetails.unknownFields()) && j.b(this.extractionStart, extractionDetails.extractionStart) && j.b(this.extractionEnd, extractionDetails.extractionEnd) && this.duration == extractionDetails.duration;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getExtractionEnd() {
        return this.extractionEnd;
    }

    public final String getExtractionStart() {
        return this.extractionStart;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iC = AbstractC1414e.c(AbstractC1414e.c(unknownFields().hashCode() * 37, 37, this.extractionStart), 37, this.extractionEnd);
        long j = this.duration;
        int i4 = iC + ((int) (j ^ (j >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m236newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("extractionStart=" + Internal.sanitize(this.extractionStart));
        arrayList.add("extractionEnd=" + Internal.sanitize(this.extractionEnd));
        arrayList.add("duration=" + this.duration);
        return C1110A.F(arrayList, ", ", "ExtractionDetails{", "}", null, 56);
    }

    public /* synthetic */ ExtractionDetails(String str, String str2, long j, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m236newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtractionDetails(String extractionStart, String extractionEnd, long j, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(extractionStart, "extractionStart");
        j.g(extractionEnd, "extractionEnd");
        j.g(unknownFields, "unknownFields");
        this.extractionStart = extractionStart;
        this.extractionEnd = extractionEnd;
        this.duration = j;
    }
}
