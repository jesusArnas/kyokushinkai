extern crate kata;

#[cfg(test)]
#[test]
fn test_say() {
    assert_eq!(kata::hello::say_hello(), "Hello World");
}
