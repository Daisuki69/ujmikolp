package dde.protobuf.fragments;

import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import dg.C1400y;
import dg.C1401z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class FontFragment extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "dde.protobuf.fragments.ExtractionDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ExtractionDetails extractionDetails;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> fonts;
    public static final C1401z Companion = new C1401z();
    public static final ProtoAdapter<FontFragment> ADAPTER = new C1400y(FieldEncoding.LENGTH_DELIMITED, z.a(FontFragment.class), "type.googleapis.com/dde.protobuf.fragments.FontFragment", Syntax.PROTO_3, null, "dde-protobuf/fragments/FontFragment.proto");

    public FontFragment() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FontFragment copy$default(FontFragment fontFragment, ExtractionDetails extractionDetails, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            extractionDetails = fontFragment.extractionDetails;
        }
        if ((i & 2) != 0) {
            list = fontFragment.fonts;
        }
        if ((i & 4) != 0) {
            byteString = fontFragment.unknownFields();
        }
        return fontFragment.copy(extractionDetails, list, byteString);
    }

    public final FontFragment copy(ExtractionDetails extractionDetails, List<String> fonts, ByteString unknownFields) {
        j.g(fonts, "fonts");
        j.g(unknownFields, "unknownFields");
        return new FontFragment(extractionDetails, fonts, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FontFragment)) {
            return false;
        }
        FontFragment fontFragment = (FontFragment) obj;
        return j.b(unknownFields(), fontFragment.unknownFields()) && j.b(this.extractionDetails, fontFragment.extractionDetails) && j.b(this.fonts, fontFragment.fonts);
    }

    public final ExtractionDetails getExtractionDetails() {
        return this.extractionDetails;
    }

    public final List<String> getFonts() {
        return this.fonts;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ExtractionDetails extractionDetails = this.extractionDetails;
        int iHashCode2 = this.fonts.hashCode() + ((iHashCode + (extractionDetails != null ? extractionDetails.hashCode() : 0)) * 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m238newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.extractionDetails != null) {
            arrayList.add("extractionDetails=" + this.extractionDetails);
        }
        if (!this.fonts.isEmpty()) {
            arrayList.add("fonts=" + Internal.sanitize(this.fonts));
        }
        return C1110A.F(arrayList, ", ", "FontFragment{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFragment(ExtractionDetails extractionDetails, List<String> fonts, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(fonts, "fonts");
        j.g(unknownFields, "unknownFields");
        this.extractionDetails = extractionDetails;
        this.fonts = Internal.immutableCopyOf("fonts", fonts);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m238newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public FontFragment(ExtractionDetails extractionDetails, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : extractionDetails, (i & 2) != 0 ? C1112C.f9377a : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }
}
