
/*
* (c) Copyright IBM Corporation 2021
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
package com.asyncapi;
  
import com.asyncapi.TripBookedProducer;
import com.asyncapi.ConnectionHelper;
import com.asyncapi.models.AnonymousMessage1;
import java.util.UUID;

public class DemoProducer {
    public static void main(String[] args) {

        // Create an instance of a message model to be sent
        AnonymousMessage1 message = new AnonymousMessage1("Producer", "React", 206, 36);

        // Create a producer instance to connect to the server
        TripBookedProducer producer = new TripBookedProducer();

        // Send the message object through the server
        producer.send(message);

        // Close the connection
        producer.close();
    }
}