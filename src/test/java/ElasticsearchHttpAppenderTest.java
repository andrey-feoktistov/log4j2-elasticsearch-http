/**
 *    Copyright 2014 Jörg Prante
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import org.junit.Test;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ElasticsearchHttpAppenderTest {

    @Test
    public void testLog() {
        Logger logger = LogManager.getLogger("test");
        logger.info("Hello World");
    }

    @Test
    public void testMassiveLog() {
        Logger logger = LogManager.getLogger("test");
        for (int i = 0; i < 10000; i++) {
            logger.info("Hello World, this is message " + i);
        }
    }

    @Test
    public void testTimeLog() {
        Logger logger = LogManager.getLogger("time");
        logger.info("Hello World");
    }

}
