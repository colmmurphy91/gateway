package com.cluborg.gateway.config;

public class SecurityConfig {

//    @Bean
//    SecurityWebFilterChain springWebFilterChain(ServerHttpSecurity http) throws Exception {
//        return http
//                .csrf().disable()
//                .authorizeExchange()
//                .anyExchange()
//                .authenticated()
//                .and()
//                .authenticationManager(reactiveAuthenticationManager())
//                .httpBasic()
//                .and()
//                .build();
//    }
//
//    @Bean
//    ReactiveAuthenticationManager reactiveAuthenticationManager(){
//        return new UserDetailsRepositoryReactiveAuthenticationManager(userDetailsRepository());
//    }
//
//    @Bean
//    public MapReactiveUserDetailsService userDetailsRepository() {
//        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
//        UserDetails hubert = userBuilder.username("hubert").password("hubert").roles("USER").build();
//        UserDetails admin = userBuilder.username("admin").password("admin").roles("USER", "ADMIN").build();
//        return new MapReactiveUserDetailsService(hubert, admin);
//    }
}
