package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.ExtractionDetails;
import dde.protobuf.fragments.ThreatsFragment;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, numX49.tnTj78("bd5Pq"));
        long jBeginMessage = protoReader.beginMessage();
        ExtractionDetails extractionDetailsDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new ThreatsFragment(extractionDetailsDecode, arrayListJ, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
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
        ThreatsFragment threatsFragment = (ThreatsFragment) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5Pz"));
        kotlin.jvm.internal.j.g(threatsFragment, numX49.tnTj78("bd5Pl"));
        if (threatsFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(protoWriter, 1, threatsFragment.getExtractionDetails());
        }
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, threatsFragment.getThreats());
        protoWriter.writeBytes(threatsFragment.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ThreatsFragment threatsFragment = (ThreatsFragment) obj;
        kotlin.jvm.internal.j.g(threatsFragment, numX49.tnTj78("bd5bP"));
        int size = threatsFragment.unknownFields().size();
        if (threatsFragment.getExtractionDetails() != null) {
            size += ExtractionDetails.ADAPTER.encodedSizeWithTag(1, threatsFragment.getExtractionDetails());
        }
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, threatsFragment.getThreats()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ThreatsFragment threatsFragment = (ThreatsFragment) obj;
        kotlin.jvm.internal.j.g(threatsFragment, numX49.tnTj78("bd5bb"));
        ExtractionDetails extractionDetails = threatsFragment.getExtractionDetails();
        return ThreatsFragment.copy$default(threatsFragment, extractionDetails != null ? ExtractionDetails.ADAPTER.redact(extractionDetails) : null, null, ByteString.EMPTY, 2, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        ThreatsFragment threatsFragment = (ThreatsFragment) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5PW"));
        kotlin.jvm.internal.j.g(threatsFragment, numX49.tnTj78("bd5b9"));
        reverseProtoWriter.writeBytes(threatsFragment.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 2, threatsFragment.getThreats());
        if (threatsFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 1, threatsFragment.getExtractionDetails());
        }
    }
}
