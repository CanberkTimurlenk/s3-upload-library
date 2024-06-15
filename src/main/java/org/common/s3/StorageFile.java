package org.common.s3;

import java.io.IOException;
import java.io.InputStream;

public interface StorageFile {

    String getName();

    InputStream getInputStream();
}
