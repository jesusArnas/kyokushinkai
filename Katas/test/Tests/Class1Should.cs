using Domain;
using FluentAssertions;
using System;
using Xunit;

namespace Tests
{
    public class Class1Should
    {
        [Fact]
        public void RunFirstTest()
        {
            var myClass = new Class1();
            myClass.Should().NotBeNull();
        }
    }
}
