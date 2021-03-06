package uk.co.m4numbers.csc8102.partone;

/*
 * Copyright 2016 M. D. Ball (m.d.ball2@ncl.ac.uk)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Class Name - DerivedKeys
 * Package - uk.co.m4numbers.csc8102.partone
 * Desc of Class - A collection class which holds the two bits of information
 * we use for encryption and message signing
 * Author(s) - M. D. Ball
 * Last Mod - 29/11/2016
 */
public class DerivedKeys
{

    public final byte[] aes_key;
    public final byte[] mac_code;

    /**
     * Constant initiator which just plugs the inputs into the final variables
     * within the class
     *
     * @param aes_key  The AES-128 key we use for encryption and decryption
     * @param mac_code The HMAC secret which we use for... well... the HMAC
     */
    public DerivedKeys(byte[] aes_key, byte[] mac_code)
    {
        this.aes_key = aes_key;
        this.mac_code = mac_code;
    }
}
