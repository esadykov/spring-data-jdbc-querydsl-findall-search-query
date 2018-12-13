package ser;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.QTuple;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import ser.repo.DemoRepo;
import ser.repo.QDemoEntity;

@SpringBootApplication
@EnableJdbcRepositories
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public String example(DemoRepo repo) {

        repo.findAll(QDemoEntity.demoEntity.isNull());

        return "";
    }
}
