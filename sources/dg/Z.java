package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.SimCard;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class Z extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        kotlin.jvm.internal.j.g(protoReader, numX49.tnTj78("bd5Pb"));
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        String strDecode3 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new SimCard(strDecode, strDecode2, strDecode3, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag == 2) {
                strDecode2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag != 3) {
                protoReader.readUnknownField(iNextTag);
            } else {
                strDecode3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        SimCard simCard = (SimCard) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5P2"));
        kotlin.jvm.internal.j.g(simCard, numX49.tnTj78("bd5PL"));
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, simCard.getType());
        protoAdapter.encodeWithTag(protoWriter, 2, simCard.getCarrierIso());
        protoAdapter.encodeWithTag(protoWriter, 3, simCard.getOperatorName());
        protoWriter.writeBytes(simCard.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SimCard simCard = (SimCard) obj;
        kotlin.jvm.internal.j.g(simCard, numX49.tnTj78("bd5Pk"));
        int size = simCard.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, simCard.getOperatorName()) + protoAdapter.encodedSizeWithTag(2, simCard.getCarrierIso()) + protoAdapter.encodedSizeWithTag(1, simCard.getType()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SimCard simCard = (SimCard) obj;
        kotlin.jvm.internal.j.g(simCard, numX49.tnTj78("bd5PB"));
        return SimCard.copy$default(simCard, null, null, null, ByteString.EMPTY, 7, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        SimCard simCard = (SimCard) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5Pr"));
        kotlin.jvm.internal.j.g(simCard, numX49.tnTj78("bd5PZ"));
        reverseProtoWriter.writeBytes(simCard.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, simCard.getOperatorName());
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, simCard.getCarrierIso());
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, simCard.getType());
    }
}
