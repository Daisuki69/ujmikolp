package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.BondedDevice;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: renamed from: dg.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1381e extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        kotlin.jvm.internal.j.g(protoReader, numX49.tnTj78("bd5Pu"));
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new BondedDevice(strDecode, strDecode2, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag != 2) {
                protoReader.readUnknownField(iNextTag);
            } else {
                strDecode2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        BondedDevice bondedDevice = (BondedDevice) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5PV"));
        kotlin.jvm.internal.j.g(bondedDevice, numX49.tnTj78("bd5PS"));
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, bondedDevice.getName());
        protoAdapter.encodeWithTag(protoWriter, 2, bondedDevice.getMacAddress());
        protoWriter.writeBytes(bondedDevice.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BondedDevice bondedDevice = (BondedDevice) obj;
        kotlin.jvm.internal.j.g(bondedDevice, numX49.tnTj78("bd5Pi"));
        int size = bondedDevice.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, bondedDevice.getMacAddress()) + protoAdapter.encodedSizeWithTag(1, bondedDevice.getName()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BondedDevice bondedDevice = (BondedDevice) obj;
        kotlin.jvm.internal.j.g(bondedDevice, numX49.tnTj78("bd5PE"));
        return BondedDevice.copy$default(bondedDevice, null, null, ByteString.EMPTY, 3, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        BondedDevice bondedDevice = (BondedDevice) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5Pj"));
        kotlin.jvm.internal.j.g(bondedDevice, numX49.tnTj78("bd5Pd"));
        reverseProtoWriter.writeBytes(bondedDevice.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bondedDevice.getMacAddress());
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, bondedDevice.getName());
    }
}
