//import io.micronaut.security.authentication.AuthenticationProvider;
//import io.micronaut.security.authentication.AuthenticationRequest;
//import io.micronaut.security.authentication.AuthenticationResponse;
//import jakarta.inject.Singleton;
//import org.reactivestreams.Publisher;
//
//import javax.net.ssl.SSLContext;
//import javax.net.ssl.SSLParameters;
//import java.io.IOException;
//import java.net.Authenticator;
//import java.net.CookieHandler;
//import java.net.ProxySelector;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import java.time.Duration;
//import java.util.Optional;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.Executor;
//
///***
// User
// ***/
//@Singleton
//public class AuthorizationSample implements AuthenticationProvider {
//    @Override
//    public Publisher<AuthenticationResponse> authenticate(AuthenticationRequest authenticationRequest) {
//        HttpClient h = new HttpClient() {
//            @Override
//            public Optional<CookieHandler> cookieHandler() {
//            }
//
//            @Override
//            public Optional<Duration> connectTimeout() {
//                return Optional.empty();
//            }
//
//            @Override
//            public Redirect followRedirects() {
//                return null;
//            }
//
//            @Override
//            public Optional<ProxySelector> proxy() {
//                return Optional.empty();
//            }
//
//            @Override
//            public SSLContext sslContext() {
//                return null;
//            }
//
//            @Override
//            public SSLParameters sslParameters() {
//                return null;
//            }
//
//            @Override
//            public Optional<Authenticator> authenticator() {
//                return Optional.empty();
//            }
//
//            @Override
//            public Version version() {
//                return null;
//            }
//
//            @Override
//            public Optional<Executor> executor() {
//                return Optional.empty();
//            }
//
//            @Override
//            public <T> HttpResponse<T> send(HttpRequest request, HttpResponse.BodyHandler<T> responseBodyHandler) throws IOException, InterruptedException {
//                return null;
//            }
//
//            @Override
//            public <T> CompletableFuture<HttpResponse<T>> sendAsync(HttpRequest request, HttpResponse.BodyHandler<T> responseBodyHandler) {
//                return null;
//            }
//
//            @Override
//            public <T> CompletableFuture<HttpResponse<T>> sendAsync(HttpRequest request, HttpResponse.BodyHandler<T> responseBodyHandler, HttpResponse.PushPromiseHandler<T> pushPromiseHandler) {
//                return null;
//            }
//        }
//        return null;
//    }
//}
