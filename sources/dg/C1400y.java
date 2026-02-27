package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.ExtractionDetails;
import dde.protobuf.fragments.FontFragment;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: renamed from: dg.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1400y extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, numX49.tnTj78("bd5e"));
        long jBeginMessage = protoReader.beginMessage();
        ExtractionDetails extractionDetailsDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new FontFragment(extractionDetailsDecode, arrayListJ, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                extractionDetailsDecode = ExtractionDetails.ADAPTER.decode(protoReader);
            } else if (iNextTag != 2) {
                protoReader.readUnknownField(iNextTag);
            } else {
                arrayListJ.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        FontFragment fontFragment = (FontFragment) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd58"));
        kotlin.jvm.internal.j.g(fontFragment, numX49.tnTj78("bd5C"));
        if (fontFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(protoWriter, 1, fontFragment.getExtractionDetails());
        }
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, fontFragment.getFonts());
        protoWriter.writeBytes(fontFragment.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FontFragment fontFragment = (FontFragment) obj;
        kotlin.jvm.internal.j.g(fontFragment, numX49.tnTj78("bd5K"));
        int size = fontFragment.unknownFields().size();
        if (fontFragment.getExtractionDetails() != null) {
            size += ExtractionDetails.ADAPTER.encodedSizeWithTag(1, fontFragment.getExtractionDetails());
        }
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, fontFragment.getFonts()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FontFragment fontFragment = (FontFragment) obj;
        kotlin.jvm.internal.j.g(fontFragment, numX49.tnTj78("bd5w"));
        ExtractionDetails extractionDetails = fontFragment.getExtractionDetails();
        return FontFragment.copy$default(fontFragment, extractionDetails != null ? ExtractionDetails.ADAPTER.redact(extractionDetails) : null, null, ByteString.EMPTY, 2, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        FontFragment fontFragment = (FontFragment) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd54"));
        kotlin.jvm.internal.j.g(fontFragment, numX49.tnTj78("bd5o"));
        reverseProtoWriter.writeBytes(fontFragment.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 2, fontFragment.getFonts());
        if (fontFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 1, fontFragment.getExtractionDetails());
        }
    }
}
