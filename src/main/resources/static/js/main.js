/**
 * Created by Bereketdeb on 5/10/2017.
 */

$(function() {
    var button = $('#loginButton');
    var box = $('#loginBox');
    var form = $('#filterFormPopup');
    button.removeAttr('href');
    button.mouseup(function(login) {
        box.toggle();
        button.toggleClass('active');
    });
    form.mouseup(function() {
        return false;
    });
    $(this).mouseup(function(login) {
        if (!($(login.target).parent('#loginButton').length > 0)) {
            button.removeClass('active');
            box.hide();
        }
    });
});

$(document).ready(function() {
    $('.responsive').slick({
        dots: false,
        infinite: false,
        speed: 300,
        slidesToShow: 4,
        customPadding: '80px',
        autoplay: false,
        autoplaySpeed: 3000,
        responsive: [
            {
                breakpoint: 1024,
                settings: {
                    slidesToShow: 3,
                    infinite: false,
                }
            },
            {
                breakpoint: 600,
                settings: {
                    slidesToShow: 2,
                }
            },
            {
                breakpoint: 480,
                settings: {
                    slidesToShow: 1,
                    slidesToScroll: 1
                }
            }
        ]
    });

    $('.responsive').on('afterChange', function(slick, currentSlide) {
        var t = 0;
        $(this).find('.slick-active').each(function() {
            t++;
            if (t == 1 || t == 2)
            {
                var dv = $(this).find('.overtext');
                dv.removeClass('last-div');
                dv.addClass('popup_content');
            }
            else
            {
                var dv = $(this).find('.overtext');
                dv.removeClass('popup_content');
                dv.addClass('last-div');
            }
        });
    });

});

var delay = 500, setTimeoutConst, setTimeoutConst1;
$(document).ready(function() {
    $('.overtext').hide();
    $('.thumbnail').hover(
        function() {
            var obj = this;
            setTimeoutConst = setTimeout(function() {
                $(obj).find('.caption').fadeIn('slow');
            }, delay);
            setTimeoutConst1 = setTimeout(function() {
                $(obj).children('div .popup_content,div .last-div').fadeIn('slow');
            }, delay);
        },
        function() {
            clearTimeout(setTimeoutConst);
            clearTimeout(setTimeoutConst1);
            $(this).find('.caption').fadeOut('slow');
            $(this).children('div .popup_content,div .last-div').fadeOut('slow');
        }
    );

    $('.parent_sec').each(function(i) {
        $(this).find('.thumbnail').each(function(j) {
            if (j > 1) {
                if ((j % 2) == 0 || (j % 3) == 0) {
                    var dv = $(this).find('.overtext');
                    dv.removeClass('popup_content');
                    dv.addClass('last-div');
                }
            }
        });


    });
    $('.thumblist').each(function(i) {
        i = i + 1;
        if (i > 1) {
            if ((i % 4) == 0 || i == 3 || i == 7 || i == 11 || i == 15 || i == 19 || i == 23) {
                var dv = $(this).find('.overtext');
                dv.removeClass('popup_content');
                dv.addClass('last-div');
            }
        }
    });
    //jQuery("img.lazy").Lazy();
    videoHeight();
});


function cancelitem(order_item_id, ordernumber) {
    $('.loader_cart').show();
    var url = HTTP_ROOT + '/shop/CancelItem';
    $.post(url, {'ordernumber': ordernumber, 'order_item_id': order_item_id}, function(res) {
        if (res.isSuccess) {
            $('.loader_cart').hide();
            $("#successPopup").modal('show');
            setTimeout(function() {
                window.location.href = HTTP_ROOT + '/user/purchaseHistory';
                return false;
            }, 5000);
        } else {
            $('.loader_cart').hide();
            $("#successPopupn").modal('show');
            setTimeout(function() {
                window.location.href = HTTP_ROOT + '/user/purchaseHistory';
                return false;
            }, 5000);
        }

    }, 'json');
}
function printDiv(divName) {
    var printContents = document.getElementById(divName).innerHTML;
    var originalContents = document.body.innerHTML;

    document.body.innerHTML = printContents;

    window.print();

    document.body.innerHTML = originalContents;
}
$(window).on('load', function() {
    videoHeight();
});
$(window).on('resize', function() {
    videoHeight();
});
function videoHeight() {
    var desWidth = $(".carousel-inner").innerWidth();
    var isIE = false;
    if (navigator.appVersion.toUpperCase().indexOf("MSIE") != -1 ||
        navigator.appVersion.toUpperCase().indexOf("TRIDENT") != -1 ||
        navigator.appVersion.toUpperCase().indexOf("EDGE") != -1) {
        isIE = true;
    }
    var desHeight = desWidth / 2.697;
    $(".item").each(function() {
        if (isIE == false) {
            $(this).find('#background').css({
                'width': desWidth,
                'height': desHeight
            });
        } else {
            $(this).find('#background').css({
                'width': desWidth,
            });
        }
        $(this).find('.videocontainer').css({'height': desHeight});
        $(this).find(".banner-image").css({'height': desHeight});
    });
}
