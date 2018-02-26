package speakerrecognition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling // TODO eventually further features
@SpringBootApplication
@EnableAspectJAutoProxy
public class SpeakerRecognitionApp {

	public static void main(String[] args) {
		SpringApplication.run(SpeakerRecognitionApp.class, args);
	}
}